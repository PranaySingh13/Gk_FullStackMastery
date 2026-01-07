package main.java._01TimeAndSpaceComplexity;

public class LogarithmicTimeAlgorithm {

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
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(binarySearch(arr, 20));

        /*
        Found in 3 iterations
        20
        */

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
