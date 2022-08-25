package One;

/*
 * The following code was featured in the *IT University of Copenhagen *Algorithms and Data Structures** exam on 2019-05-20
 * The code was shared online by the teachers for practise
 */

public class CDEFG {
    private static int[] A;

    public static void main(String[] args) {
        int N = 20;

        // 2.C
        System.out.println("\n2.C");
        for (int i = 1; i < N; i = i * 2) {
            System.out.print("*");
        }

        // 2.D
        System.out.println("\n2.D");
        for (int i = 0; i < N; i = i + 1) {
            for (int j = i; j > 0; j = j - 2) {
                System.out.print("*");
            }
        }

        // 2.E
        System.out.println("\n2.E");
        for (int i = 0; i < N; i = i + 1) {
            if (i < 5) {
                for (int j = 0; j < N; j = j + 1) {
                    // A[i] = A[i] + A[j] + i;
                }
            }
        }

        // 2.G
        System.out.println("\n2.G");
        System.out.println(r(N));
    }

    // 2.F
    // System.out.println("\n2.F");
    static int r(int N) {
        if (N > 0) {
            return r(N - 1) + r(N - 1) + N;
        } else {
            return 2;
        }
    }
}
