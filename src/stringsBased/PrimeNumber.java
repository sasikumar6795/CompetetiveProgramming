package stringsBased;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scan =new Scanner(System.in);
        int a =  scan.nextInt();
        System.out.println(calculateIsPrimeNumber(a));
    }

    private static boolean calculateIsPrimeNumber(int n) {
        if(n==1)
            return false;
        if (n==2||n==3||n==5)
            return true;
        if (n%2==0||n%3==0||n%5==0)
            return false;
        return true;
    }
}
