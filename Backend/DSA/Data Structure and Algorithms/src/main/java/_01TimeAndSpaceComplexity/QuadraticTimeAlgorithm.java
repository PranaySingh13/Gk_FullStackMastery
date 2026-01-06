package main.java._01TimeAndSpaceComplexity;

public class QuadraticTimeAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i : arr) { //Loop runs n times
            for (int j : arr) { //Loop runs n times
                System.out.println("(" + i + "," + j + ")");
            }
        }

        /*
        Outer loop runs n times.
        Inner loop runs n times for each outer iteration.
        Total = n × n = n²

        Time Complexity: O(n²)
        Space Complexity: O(1)
        */
    }
}
