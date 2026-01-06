package main.java._01TimeAndSpaceComplexity;

public class LinearTimeAlgorithm {
    public static void main(String[] args) {
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
