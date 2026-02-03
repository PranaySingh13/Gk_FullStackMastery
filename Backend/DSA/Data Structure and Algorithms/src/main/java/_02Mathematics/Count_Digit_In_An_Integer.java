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
        n = Math.abs(n); // Handle negative numbers
        if (n == 0)
            return 1;  // Zero has one digit
        if (n / 10 == 0)
            return 1;  // Single-digit number

        return 1 + countDigitsMethod2(n / 10);
    }

    /*
    Logarithmic Solution Time Complexity O(1)
    */
    private static int countDigitsMethod3(int n) {
        // Handle 0 explicitly since log10(0) is undefined
        if (n == 0) {
            return 1;
        }
        // Take absolute value for negative numbers
        n = Math.abs(n);

        // Use log10 formula
        return (int) Math.floor(Math.log10(n) + 1);
    }


}
