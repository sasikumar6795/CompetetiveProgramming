package stringsBased;

public class GenerateSubsets {
    public static void main(String[] args) {
        String str = "ABC";

        printSub(str, "", 0);
    }

    private static void printSub(String str, String current, int i) {

        if(i==str.length()) {
            System.out.print(current+" ");
            return;
        }
        printSub(str,current,i+1);
        printSub(str,current+str.charAt(i),i+1);
    }
}
