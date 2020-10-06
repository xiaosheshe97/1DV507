package count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet{
    private BST root;
    private int size;
    private Word[] wordList = new Word[8];
    private int count = 0;

    public TreeWordSet() {
        root = null;
        size = 0;
    }

    private class BST{
        Word word;
        BST left = null;
        BST right = null;

        public BST(Word word) {
            this.word = word;
        }
        private void add(Word newWord){
            if (newWord.compareTo(word) < 0){
                if (left == null){
                    left = new BST(newWord);
                    size++;
                }
                left.add(newWord);
            }
            else if (newWord.compareTo(word) > 0){
                if (right == null){
                    right = new BST(newWord);
                    size++;
                }
                else
                    right.add(newWord);
            }
        }
        private boolean contains(Word newWord){
            if (newWord.compareTo(word) < 0){
                if (left == null){
                    return false;
                }
                else
                    return left.contains(newWord);
            }
            else if (newWord.compareTo(word)>0){
                if (right ==  null)
                    return false;
                else
                    return right.contains(newWord);
            }
            return true;
        }
        private String print(){
            StringBuilder stringBuilder = new StringBuilder();
            if (left != null)
                left.print();
            stringBuilder.append(" " + word);
            if (right != null)
                right.print();
            return stringBuilder.toString();
        }
        private Word[] getWord(){
            if (left != null){
                left.getWord();
            }
            if (count == wordList.length){
                resize();
            }
            wordList[count] = word;
            count++;
            if (right != null){
                right.getWord();
            }
            return wordList;
        }
        private void resize(){
            Word[] temp = new Word[wordList.length * 2];
            for(int i = 0; i < wordList.length; i++){
                temp[i] = wordList[i];
            }
            wordList = temp;
        }
    }
    @Override
    public void add(Word word) {
        if (root == null){
            root = new BST(word);
            size++;
        }
        else{
            root.add(word);
        }

    }

    @Override
    public boolean contains(Word word) {
        if (size == 0){
            return false;
        }
        else
            return root.contains(word);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        return root.print();
    }

    @Override
    public Iterator<Word> iterator() {
        return new TreeWordSetIterator();
    }
    public class TreeWordSetIterator implements Iterator<Word>{
        private int count = 0;

        public TreeWordSetIterator() {
            root.getWord();
        }

        @Override
        public boolean hasNext() {
            if (root == null){
                return false;
            }
            else if (wordList[count] == null){
                return false;
            }
            else
                return count  < wordList.length;
        }

        @Override
        public Word next() {
            return wordList[count++];
        }
    }
}
