package stringsBased;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan =new Scanner(System.in);
        double n =  scan.nextInt();
        //System.out.println(factorial(n));
        double N = factorial(n);
        System.out.println(countDigits(N));
    }

    public static int countDigits(double n) {
        if(n==0 || n==1){
            return 1;
        }
        return (int) Math.floor(Math.log10(n)+1);
    }

    public static double factorial(double num) {
        if(num==1 || num==0) {
            return 1;
        }
        while(num>0) {
            return num * (factorial((num-1)));
        }
        return 0;
    }
}
