package count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class WordCount2Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashWordSet hashWordSet = new HashWordSet();
        TreeWordSet treeWordSet = new TreeWordSet();

        File file = new File("/Users/zhuxiaohe/Desktop/1DV507/assignment-4/xz222zx_assign4/src/count_words/words.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            Word w = new Word(scanner.next());
            hashWordSet.add(w);
            treeWordSet.add(w);
        }
        System.out.println("The size of hashWordSet is "+hashWordSet.size());
        System.out.println("The size of treeWordSet is "+treeWordSet.size());

        System.out.println("TreeWordSet iterator:");
        Iterator<Word> iterator2 = treeWordSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("HashWordSet iterator:");
        Iterator<Word> iterator1 = hashWordSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
