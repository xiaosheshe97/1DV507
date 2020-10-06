package xz222az_assign2;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class WarAndPeace {
    public static void main(String[] args) throws IOException {
        String text = readText("WarAndPeace.txt");
        String[] words = text.split(" ");  // Simple split, will be cleaned up later on
        System.out.println("Initial word count: "+words.length);   // We found 577091

        //all characters except ' -
        String regEx="\\p{Punct}".replaceAll("'—-","");
        //remove contain digit, character, ignore case
        Stream<String> stream1 = Arrays.stream(words);
        long n = stream1.filter(WarAndPeace::isWord).
                map(String::toLowerCase).
                map(s -> s.replaceAll(regEx,"")).
                map(s -> s.replaceAll("\\d+","")).
                distinct().count();
        System.out.println("Unique words are " + n);
    }

    private static String readText(String s) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader(s));
        String line;
        StringBuffer b = new StringBuffer();
        while((line = br.readLine())!=null){
            b.append(line).append(" ");
        }
        return b.toString();
    }

    public static boolean isWord(String s) {
        try{
            int i = Integer.parseInt(s);
            return false;
        }
        catch (RuntimeException e){
            return true;
        }
    }
}
