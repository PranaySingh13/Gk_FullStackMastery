package main.java._02Mathematics;

/*
A palindrome number reads the same backward as forward — for example, 121, 1331, and 1001.
*/
public class Palindrome_Number {

    /*
    Iterative Method (Reverse the Number) Approach
    Time Complexity O(log n)

    Note: Not optimized approach for large integers
    */
    public static boolean isPalindrome(int number) {
        if (number < 0)
            return false; //negative number's cannot be palindrome

        int reversed = 0;
        int original = number;

        //Repeat until number becomes zero
        while (number != 0) {
            int digit = number % 10; //Extracting the last digit
            reversed = reversed * 10 + digit; //Adding it to reversed variable
            number = number / 10; //Removing the last digit from number
        }
        return original == reversed;
    }



    public static void main(String[] args) {
        System.out.println(isPalindrome(1001)); //true
        System.out.println(isPalindrome(1008)); //false
    }
}
