package main.java._01TimeAndSpaceComplexity;

public class ConstantSpaceComplexity {

    public static int sum(int n) {
        int result = 0; // 1 variable
        for (int i = 0; i <= n; i++)
            result = result + i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(100));
    }
    /*
    Variables: result, i → constant count
    Space Complexity = O(1) (does not depend on number n)
    */
}
