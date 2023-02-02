import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class FourSumFast {
    // returns true if there are any duplicates in the input array
    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // print all distinct 4-tuples (i, j, k, l) such that a[i] + a[j] + a[k] + a[l] = 0
    public static void printAll(int[] a) {
        int N = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) {
            throw new IllegalArgumentException("Array contains duplicates.");
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int z = Arrays.binarySearch(a, k + 1, N, -(a[i] + a[j] + a[k]));
                    if (z > k) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k] + " " + a[z]);
                    }
                }
            }
        }
    }

    // return number of distinct 4-tuples (i, j, k, l) such that a[i] + a[j] + a[k] + a[l] = 0
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        Arrays.sort(a);
        if (containsDuplicates(a)) {
            throw new IllegalArgumentException("Array contains duplicates.");
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int z = Arrays.binarySearch(a, k + 1, N, -(a[i] + a[j] + a[k]));
                    if (z > k) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println(count);
        StdOut.println("elapsed time " + timer.elapsedTime());
    }
}
