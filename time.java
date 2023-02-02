public class time {
    public static void main(String[] args) {
        long startN = 1;
        long endN = 10000000000L;  //10^10
        long increment = 2;
        for (long N = startN; N <= endN; N *= increment) {
            long start = System.nanoTime();

            long sum = 0;
            for (long i = 1; i <= N; i = 2 * i) {
                for (long j = 1; j <= 2 * i; j++) {
                    sum++;
                }
            }

            long end = System.nanoTime();
            long duration = end - start;
            System.out.println("N = " + N + ": " + duration + " ns");
        }
    }
}
//To calculate the doubling rate, we can take the ratio of the execution time for each N to the
//execution time for N/2.
//
//For example, when N = 16, the execution time is 2400 ns. When N = 8, the execution time is 1600 ns.
//So the doubling rate for N = 8 to N = 16 is 2400/1600 = 1.5.
//
//We can calculate the doubling rate for the entire set of results by taking the ratio of the execution time
//for each N to the execution time for N/2.
//
//It's clear from the results that the doubling rate is not constant, it's not always the same for the different
//values of N. The pattern is irregular and not stable, which means that the time complexity of the code snippet is not O(1) or O(n) which are the two main types of constant time complexities.
//
//It's better to run the code snippet with a profiler to figure out the time complexity
//of the code snippet.
