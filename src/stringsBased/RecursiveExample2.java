package stringsBased;

import java.util.Scanner;

public class RecursiveExample2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan =new Scanner(System.in);
        int n =  scan.nextInt();
        System.out.println(recursiveExample(n));
    }

    private static int recursiveExample(int n) {
        if(n==1) {
            return 0;
        }
        return 1 + recursiveExample(n/2);
    }
}
