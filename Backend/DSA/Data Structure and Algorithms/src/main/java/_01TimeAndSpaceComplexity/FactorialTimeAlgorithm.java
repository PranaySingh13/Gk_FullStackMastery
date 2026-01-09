package main.java._01TimeAndSpaceComplexity;

public class FactorialTimeAlgorithm {

    static int iterations = 0;
    public static void permute(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            System.out.println("Total iterations to permute " + str + ": " + iterations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            iterations++;
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permute(rest, result + ch);
        }
    }
    public static void main(String[] args) {
        permute("ABC", ""); //Total iterations to permute : 15
    }
}
