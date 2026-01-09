package main.java._01TimeAndSpaceComplexity;

public class SubLogarithmicTimeAlgorithm {

    public static void countIterations(double n, double c) {
        int iterations = 0;
        for (double i = 2.0; i <= n; i = Math.pow(i, c)) {
            iterations++;
        }
        System.out.println("Total loop runs: " + iterations);
    }

    public static void main(String[] args) {
        countIterations(1_000_000_000, 2); //Total loop runs: 5
    }

    /*
    Time Complexity: O(log log n) which is nearly equal to O(1)
    Space Complexity: O(1)
    */
}
