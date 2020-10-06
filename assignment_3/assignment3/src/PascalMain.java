import java.util.Arrays;

public class PascalMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalRow(30)));
    }

    public static int[] pascalRow(int n) {
        int[] pascal = new int[n + 1];
        pascal[0] = 1;
        pascal[n] = 1;
        if (n == 0){
            pascal[0] = 1;
        }
        else {
            int[] previous = pascalRow(n-1);
            for (int j = 1; j < n; j++) {
                pascal[j] = previous[j-1] + previous[j];
            }
        }


        return pascal;
    }
}
