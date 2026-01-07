package main.java._01TimeAndSpaceComplexity;


public class ConstantTimeAlgorithm {

    /*
    Set of non-recursive and non-loop statements takes O(1) time
    */
    public static void swap(int position1, int position2) {
        int temp = position1;
        position1 = position2;
        position2 = temp;
        System.out.println("Position1: " + position1 + ", " + "Position2: " + position2);
    }

    /*
    A loop or recursion that runs a constant number of times is also considered as O(1).
    */
    public static void print() {
        for (int i = 1; i < 3; i++) {
            System.out.println("Time Complexity analysis is informative."); // C * O(1) = O(1)
        }
    }

    public static void main(String[] args) {
        swap(1, 2);
        print();
    }
}
