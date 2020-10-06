package count_words;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet {
    private int size;
    private Node[] buckets = new Node[8];

    @Override
    public Iterator<Word> iterator() {
        return new HashWordSetIterator();
    }

    private class HashWordSetIterator implements Iterator<Word>{
        private int pos;
        private Node current;

        public HashWordSetIterator(){
            pos = 0;
            current = null;
        }

        @Override
        public boolean hasNext() {
            if (current != null && current.next != null)
                return true;
            for (int i = pos; i < buckets.length; i++){
                if (buckets[i] != null)
                    return true;
            }
            return false;
        }

        @Override
        public Word next() {
            if (current != null && current.next != null) {
                current = current.next;
            } else {
                do {
                    if (pos == buckets.length) {
                        throw new NoSuchElementException();
                    }
                    current = buckets[pos];
                    pos++;
                } while (current == null);
            }
            return current.value;
        }
    }

    private class Node{
        Word value;
        Node next = null;
        public Node(Word word){
            value = word;
        }

        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HashSet: ");
            for (Node bucket : buckets) {
                Node node = bucket;
                while (node != null) {
                    stringBuilder.append(node.value.toString());
                    stringBuilder.append(" ");
                    node = node.next;
                }
            }
            return stringBuilder.toString();
        }
    }
    private int getBucketNumber(Word word){
        int hc = word.hashCode();
        if (hc < 0)
            hc = -hc;
        return hc%buckets.length;
    }
    @Override
    public void add(Word word) {
        int pos  = getBucketNumber(word);
        Node node = buckets[pos];
        while (node != null){
            if (node.value.equals(word))
                return;
            else
                node = node.next;
        }
        node = new Node(word);
        node.next = buckets[pos];
        buckets[pos] = node;
        size++;
        if (size == buckets.length)
            rehash();
    }

    private void rehash(){
        Node[] temp = buckets;
        buckets = new Node[2*temp.length];
        size = 0;
        for (Node n : temp){
            if (n == null)
                continue;
            while (n != null){
                add(n.value);
                n = n.next;
            }
        }
    }

    @Override
    public boolean contains(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];
        while (node != null){
            if (node.value.equals(word))
                return true;
            else
                node = node.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
