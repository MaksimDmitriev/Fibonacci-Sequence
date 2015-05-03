package algo.fibonacci;

public class Fibonacci {

    public static long compute(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return compute(n - 1) + compute(n - 2);
    }
}
