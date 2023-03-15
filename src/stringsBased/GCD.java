package stringsBased;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scan =new Scanner(System.in);
        int a =  scan.nextInt();
        System.out.println("Enter the second number");
        int b =  scan.nextInt();
        //System.out.println(calculateGCDValue(a, b));
        //System.out.println(calculateGCDValue2(a,b));
    }


    private static int calculateGCDValue2(int a, int b) {
        if(b==0) {
            return a;
        }
        return calculateGCDValue2(b,a%b);
    }


    private static int calculateGCDValue(int a, int b) {
        int res=1;
        for(int i=a;i<=b;i++) {
            if(a%i==0 && b%i==0) {
                res = i;
                break;
            }
        }
        return res;
    }
}
