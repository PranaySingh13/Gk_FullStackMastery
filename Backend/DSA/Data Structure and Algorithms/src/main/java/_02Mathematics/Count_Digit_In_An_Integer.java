package main.java._02Mathematics;

public class Count_Digit_In_An_Integer {

    public static void main(String[] args) {
        System.out.println("No. of digits: " + countDigitsMethod1(0));
        System.out.println("No. of digits: " + countDigitsMethod1(1234));
        System.out.println("No. of digits: " + countDigitsMethod2(5678));
        System.out.println("No. of digits: " + countDigitsMethod3(91011));
    }

    /*
    Iterative Solution Time Complexity O(n)
    */
    private static int countDigitsMethod1(int n) {
        int count = 0;
        if (n == 0)
            return (count + 1);
        else {
            // Convert negative to positive
            n = Math.abs(n);

            while (n != 0) {
                n = n / 10; //To get remaining digits
                count++;
            }
            return count;
        }
    }

    /*
    Recursive Solution Time Complexity O(n)
    */
    private static int countDigitsMethod2(int n) {
        int count = 0;
        if (n == 0)
            return 0;
        return 1 + countDigitsMethod2(n / 10);
    }

    /*
    Logarithmic Solution Time Complexity O(1)
    */
    private static int countDigitsMethod3(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }


}
