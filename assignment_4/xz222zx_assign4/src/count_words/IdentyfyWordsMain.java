package count_words;

import java.io.*;
import java.util.Scanner;

public class IdentyfyWordsMain {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zhuxiaohe/Desktop/1DV507/assignment-4/xz222zx_assign4/src/count_words/HistoryOfProgramming.txt");
        Scanner scanner = new Scanner(file);
        StringBuffer lineBuffer = new StringBuffer();

        while (scanner.hasNext()) {
            lineBuffer.append(scanner.nextLine());
        }

        String st = lineBuffer.toString();
        StringBuffer wordsBuffer = new StringBuffer();
        for (int n = 0; n < st.length(); n++) {
            if (Character.isLetter(st.charAt(n)) || st.charAt(n) == ' ') {
                wordsBuffer.append(st.charAt(n));
            }
        }
        String words = wordsBuffer.toString();

        File newFile = new File("/Users/zhuxiaohe/Desktop/1DV507/assignment-4/xz222zx_assign4/src/count_words/words.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
        bufferedWriter.write(words);
        bufferedWriter.flush();

    }
}

