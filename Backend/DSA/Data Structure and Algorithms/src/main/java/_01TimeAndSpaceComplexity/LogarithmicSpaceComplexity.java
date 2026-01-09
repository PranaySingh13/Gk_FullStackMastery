package main.java._01TimeAndSpaceComplexity;

public class LogarithmicSpaceComplexity {

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binarySearch(arr, start, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, end, key);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[1024];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = i;
        int targetValue = 900;
        System.out.println(binarySearch(arr1, 0, arr1.length, targetValue));
    }
    /*
    Each recursive call splits the array in half.

    Depth of recursion = log₂(n)
    Space Complexity = O(log n) (recursion stack)
    */
}
