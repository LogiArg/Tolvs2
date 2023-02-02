/**********************************************************
 *  Beinagrind að lausn á æfingadæmi í heimadæmum 3
 *    Tölvunarfræði 2, vor 2023
 **********************************************************/

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class Hlutsummur {
    public static int[][] reiknaHS(int[] A) {
        int N = A.length;
        int[][] B = new int[N][N];
        // gefið reiknirit til að reikna hlutsummur
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                for (int k = i; k <= j; k++) {
                    B[i][j] += A[k];
                }
            }
        }
        // FYLLA INN ...

        return B;
    }

    public static void main(String[] args) {
        int N = 100;
        int[] A = new int[N];

        // Búa til slembigildi í fylkið (nota StdRandom.uniformInt())
        for (int i = 0; i < N; i++) {
            A[i] = (int) (StdRandom.uniform() * 100);
        }
        // FYLLA INN ...
        // Taka tímann á útreikningi
        Stopwatch timer = new Stopwatch();
        int[][] B = reiknaHS(A);
        double eTime = timer.elapsedTime() * 1000;

        StdOut.println("Elapsed time = " + eTime);

        // Einföld stikkprufa til að athuga hvort rétt reiknað ...
        StdOut.println("A[2] + A[3] = " + (A[2] + A[3]));
        StdOut.println("B[2][3] = " + B[2][3]);
    }
}
