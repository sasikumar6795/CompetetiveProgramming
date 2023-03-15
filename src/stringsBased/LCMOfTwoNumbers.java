package stringsBased;

import java.util.Scanner;

public class LCMOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scan =new Scanner(System.in);
        int a =  scan.nextInt();
        System.out.println("Enter the second number");
        int b =  scan.nextInt();
        calculateLCMValue(a,b);

        System.out.println(calculateLCMValue2(a,b));
    }

    private static int calculateLCMValue2(int a, int b) {
        int gcdValue = calculateGCDValue2(a,b);
        return (a*b)/gcdValue;
    }

    private static int calculateGCDValue2(int a, int b) {
        if(b==0) {
            return a;
        }
        return calculateGCDValue2(b,a%b);
    }

    private static int calculateLCMValue(int a, int b) {
        int res=Math.max(a,b);
        while(true) {
            if(res%a==0&&res%b==0) {
                return res;
            }
            res++;
        }
    }
}
