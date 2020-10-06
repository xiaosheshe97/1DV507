import java.io.*;

public class PrintJavaMain {
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        File directory = new File("/Users/zhuxiaohe/Desktop/1DV507/assignment-3");
        printAllJavaFiles(directory);
    }

    private static void printAllJavaFiles(File directory) throws IOException {
        try {
            if (!directory.isDirectory()) {
                ;
            } else {
                File[] subs = directory.listFiles();
                try {
                    for (File f : subs) {
                        printAllJavaFiles(f);
                        if (f.getName().endsWith(".java")) {
                            System.out.print(f.getName());
                            BufferedReader br = new BufferedReader(new FileReader(f));
                            while (br.readLine() != null) {
                                count++;
                            }
                            System.out.print("the number of rows is " + count);
                            System.out.println();
                        }
                        count = 0;
                    }
                } catch (NullPointerException e) {
                }
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }


}
