/*
 * The following code was featured in the IT-University exam (2019-05-20) and was shared by the teachers for practise. 
 */

public class M {
    int[] L = { 0 };
    int N = 0;
    int max = Integer.MIN_VALUE;

    void insert(int item) {
        if (L.length == N)
            resize(2 * N);
        assert (N < L.length);
        L[N] = item;
        N += 1;
        if (item > max)
            max = item;
    }

    void resize(int newN) {
        int[] tmp = new int[newN];
        for (int i = 0; i < N; i++)
            tmp[i] = L[i];
        L = tmp;
    }

    boolean contains(int item) {
        for (int i = 0; i < N; i++)
            if (item == L[i])
                return true;
        return false;
    }

    int reportmax() {
        return max;
    }

    public static void main(String[] args) {
        M newM = new M();

        System.out.println("2.b"); // exam question 2.b
        newM.insert(3);
        System.out.println(newM.contains(3));
        System.out.println(newM.contains(4));
        newM.insert(3);
        System.out.println(newM.reportmax());
        newM.insert(4);
        System.out.println(newM.contains(3));
        System.out.println();
    }
}