package stringsBased;

import java.util.Scanner;

public class PlaindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(palindrome(input, 0, input.length() - 1));
    }

    private static boolean palindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        return input.charAt(start) == input.charAt(end) && palindrome(input, start + 1, end - 1);
    }
}
