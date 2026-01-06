package main.java._01TimeAndSpaceComplexity;


public class ConstantTimeAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 5};
        System.out.println(arr[2]); //Access element at index 2
        /*
          No matter how large array is, accessing an element by index takes constant time O(1).

          Time Complexity: O(1)
          Space Complexity: O(1)
         */
    }
}
