package main.java._01TimeAndSpaceComplexity;

public class LogarithmicTimeAlgorithm {

    public static void iterationCount(int n, int c) {
        int iterations = 0;
        for (int i = 1; i < n; i = i * c) {
            iterations++;
        }
        System.out.println("Total Loop 1 runs: " + iterations);
        iterations = 0;
        for (int i = n; i > 1; i = i / c) {
            iterations++;
        }
        System.out.println("Total Loop 2 runs: " + iterations);
    }

    public static int binarySearch(int[] arr, int targetValue) {
        int lowestIndex = 0;
        int higheshIndex = arr.length - 1;
        int iterations = 0; // Not needed, just for logging purpose

        while (lowestIndex <= higheshIndex) {
            iterations++;
            int midIndex = lowestIndex + (higheshIndex - lowestIndex) / 2;
            if (arr[midIndex] == targetValue) {
                System.out.println("Found in " + iterations + " iterations");
                return targetValue; // Found
            } else if (arr[midIndex] < targetValue)
                lowestIndex = midIndex + 1; //search right half
            else
                higheshIndex = midIndex - 1; //search left half
        }
        System.out.println("Not found. Iterations: " + iterations);
        return -1; // Not Found
    }

    public static void main(String[] args) {
        iterationCount(33, 2); // Loop1 & Loop2 runs 6 & 5 times resp.
        iterationCount(81, 3); // Loop1 & Loop2 runs 4 & 4 times resp.

        int[] arr1 = new int[1024];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = i;
        int targetValue = 900;
        System.out.println("Index of " + targetValue + ": " + binarySearch(arr1, targetValue));

        /*
        Found in 10 iterations (Note if it would be linear search it will take 900 iterations)
        Index of 900: 900
        */
    }

        /*
        An algorithm runs in O(log n) time when the problem size reduces by a constant factor (usually ½) at each step.
        you keep skipping half of them every time.
        */

}
