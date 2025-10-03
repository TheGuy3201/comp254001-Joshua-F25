package exercise1;

public class RecursiveProduct {
    public static int calcProduct(int m, int n) {
        if(n == 1) {
            return m;
        } else {
            return m + calcProduct(m, n - 1);
        }
    }
}
