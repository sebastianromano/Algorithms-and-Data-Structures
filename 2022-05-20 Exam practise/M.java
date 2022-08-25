/*
 * The following code was featured in the *IT University of Copenhagen *Algorithms and Data Structures** exam on 2019-05-20 
 * The code was shared online by the teachers for practise
 * 
 * Added code by @sebastianromano reflects following assignments: 
 *  1. Write a method reportmin() that returns to smallest inserted element. 
 *      If the data structure is empty, you may return anything or your program may fail. 
 *      Do not change the insert() method.
 *  2. Modify the data structure so that the space usage is proportional to the number of different items inserted. 
 *      You may not change the worst-case running time of any of the methods. 
 *      (But you may change their amortised running time.)
 *  3. ...
 */

public class M {
    int[] L = { 0 };
    int N = 0;
    int max = Integer.MIN_VALUE; // max is used to find the maximum value in the array
    int min = Integer.MAX_VALUE; // min is used to find the minimum value in the array (@sebastianromano)

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

    int reportmin() { // method that returns the smallest inserted element (@sebastianromano)
        for (int i = 0; i < N; i++)
            if (L[i] < min)
                min = L[i];
        return min;
    }

    public static void main(String[] args) {
        M newM = new M();
        System.out.println(newM.reportmax());
        System.out.println(newM.reportmin());

        System.out.println("2.b"); // exam question 2.b
        newM.insert(3);
        System.out.println(newM.contains(3));
        System.out.println(newM.contains(4));
        newM.insert(3);
        System.out.println(newM.reportmax());
        newM.insert(4);
        System.out.println(newM.contains(3));
        System.out.println();
        System.out.println(newM.reportmin());
        System.out.println(newM.reportmax());
    }
}