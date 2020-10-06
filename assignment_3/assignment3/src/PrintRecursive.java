public class PrintRecursive {
    public static void main(String[] args) {
        String str = "Hello Everyone!";

        print(str, 0);
        System.out.println(); // Line break
        printReverse(str, 0);
    }

    private static void printReverse(String str, int i) {
        if (i == str.length()){
            ;
        }
        else {
            printReverse(str,i + 1);
            System.out.print(str.charAt(i));
        }
    }

    private static void print(String str, int i) {
        if (i == str.length()){
            ;
        }
        else {
            System.out.print(str.charAt(i));
            print(str,i + 1);
        }
    }
}
