package stringsBased;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan =new Scanner(System.in);
        int n =  scan.nextInt();
        System.out.println(fact(n));
        int result = fact(n);
        System.out.println(trailingZeros2(n));

    }

    private static int trailingZeros2(int n) {

        int res=0;
        for(int i=5;i<=n;i=i*5) {
            res=res+(n/i);
        }
        return res;
    }

//    public static int trailingZeros(int factorialNumber) {
//        int tz=0;
//        while(factorialNumber>0) {
//            if(factorialNumber%10 ==0)
//            {
//                tz=tz+1;
//                factorialNumber=factorialNumber/10;
//            }
//            else{
//                return tz;
//            }
//        }
//        return tz;
//    }


    public static int fact(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        while(n>0) {
            return n * fact(n-1);
        }
        return n;
    }
}
