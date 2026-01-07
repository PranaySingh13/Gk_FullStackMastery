package main.java._01TimeAndSpaceComplexity;

public class LinearTimeAlgorithm {

    public static void linearTimeIteration(int n, int c) {

        int iteration = 0;
        for (int i = 0; i < n; i += c) {
            iteration++;
            System.out.println("Loop 1 runs iteration: " + iteration);
        }
        iteration = 0;
        for (int i = n; i > 0; i -= c) {
            iteration++;
            System.out.println("Loop 2 runs iteration: " + iteration);
        }
    }

    public static void main(String[] args) {

        linearTimeIteration(10, 2); // loop 1 and 2 runs 5 times
        linearTimeIteration(20, 6); // loop 1 and 2 runs 4 times


        int[] arr = {10, 30, 2, 0, 50, 100};
        for (int i = 0; i < arr.length; i++) { //Loop runs n times
            System.out.print(arr[i] + " ");
        }
        /*
            Count operations dependent on input size (n).
            Time Complexity: O(n)
            Space Complexity: O(1)
        */
    }
}
