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
}