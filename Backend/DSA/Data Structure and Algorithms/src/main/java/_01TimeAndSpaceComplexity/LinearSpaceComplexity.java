package main.java._01TimeAndSpaceComplexity;

public class LinearSpaceComplexity {
    public static int[] createArray(int n) {
        int[] arr = new int[n];   // uses n space
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(createArray(10).length);
    }
}
