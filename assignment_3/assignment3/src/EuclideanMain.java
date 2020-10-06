public class EuclideanMain {
    public static void main(String[] args) {
        System.out.println("GCD(-3,12) = " +GCD(-3,12));
        System.out.println("GCD(42,56) = " +GCD(42,56));
        System.out.println("GCD(17,96) = " +GCD(17,96));
        System.out.println("GCD(0,11) = " +GCD(0,11));


    }
    public static int GCD(int m, int n){
        if(m == 0){
            return n;
        }
        if (n == 0){
            return m;
        }
        int gcd = 1;
        m = Math.abs(m);
        n = Math.abs(n);
        for (int i = 1; i <= m && i <= n; i++){
            if (n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
