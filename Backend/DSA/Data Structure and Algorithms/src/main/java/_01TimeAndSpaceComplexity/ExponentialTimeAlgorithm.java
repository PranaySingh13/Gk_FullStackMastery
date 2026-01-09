package main.java._01TimeAndSpaceComplexity;

public class ExponentialTimeAlgorithm {

    static int iteration = 0;

    public static int fib(int n) {
        iteration++;
        if (n <= 1) return n;
        System.out.println("Total iterations: " + iteration);
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5)); //Total iterations: 12 to return 5
    }
}
