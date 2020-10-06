package count_words;

public class Word implements Comparable<Word>{
    private String word;

    public Word(String str){
        word = str;
    }
    public String toString(){
        return word;
    }
    public int hashCode(){
        int hashCode = 0;
        for (int i = 0; i < word.length();i++){
            char c = word.charAt(i);
            hashCode += Character.getNumericValue(c);
        }
        return hashCode;
    }
    public boolean equals(Object other){
        if (other instanceof Word){
            return word.equalsIgnoreCase(other.toString());
        }
        return false;
    }
    @Override
    public int compareTo(Word w) {
        return word.compareToIgnoreCase(w.word);
    }
}
