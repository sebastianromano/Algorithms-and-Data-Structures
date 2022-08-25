public class FindLog {
    /**
     * Find the logarithm of a number in base 2.
     * Java program to find log_2(n) and log_2(n) using recursion
     */ 
    public static int findLog2(int n) {
        if (n == 1) {
            return 0;
        }
        return 1 + findLog2(n / 2);
    }

    public static int findLog10(int n) {
        if (n == 1) {
            return 0;
        }
        return 1 + findLog10(n / 10);
    }

    public static void main (String[] args) {
        System.out.println(findLog2(100));
        System.out.println(findLog10(100));
    }
}