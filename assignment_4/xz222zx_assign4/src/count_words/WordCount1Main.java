package count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount1Main {
    public static void main(String[] args) throws FileNotFoundException {
        Set<Word> hashSet = new HashSet<>();
        Set<Word> treeSet = new TreeSet<>();
        File file = new File("/Users/zhuxiaohe/Desktop/1DV507/assignment-4/xz222zx_assign4/src/count_words/words.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            Word w = new Word(scanner.next());
            hashSet.add(w);
            treeSet.add(w);
        }
        System.out.println("The size of hashSet is "+hashSet.size());
        System.out.println("The size of treeSet is "+treeSet.size());

        Iterator<Word> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
