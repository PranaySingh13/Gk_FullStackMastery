package main.java._01TimeAndSpaceComplexity;

public class PolynomialTimeAlgorithm {

    public static void countIteration(int n) {
        int iteration = 0;
        for (int i = 0; i < n; i++) { //loop runs n times
            for (int j = 0; j < n; j++) { //loop runs n times
                iteration++;
            }
        }
        System.out.println("Total count of iteration: " + iteration);
    }

    public static void consecutiveTimeComplexity(int n){
        int iteration = 0;
        for (int i = 0; i < n; i++) { //loop runs n times
            for (int j = 1; j < n; j=j*2) { //loop runs log n times
                iteration++;
            }
        }
        for (int i = 0; i < n; i++) { //loop runs n times
            for (int j = 0; j < n; j++) { //loop runs n times
                iteration++;
            }
        }
        System.out.println("Total count of iteration: " + iteration);
    }

    public static void main(String[] args) {
        countIteration(3); //Total count of iteration: 9
        consecutiveTimeComplexity(3);
        /*
        Outer loop runs n times.
        Inner loop runs n times for each outer iteration.
        Total = n × n = n²

        Time Complexity: O(n²)
        Space Complexity: O(1)
        */
    }
}
