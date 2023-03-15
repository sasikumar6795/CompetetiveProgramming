package stringsBased;

public class SubsequenceOfOther {

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "grges";
        System.out.println(checkSubsequence(s1, s2));
    }

    public static boolean checkSubsequence(String s1, String s2) {

        int i=0;
        int j=0;

        while(i<s1.length()) {
            if(s1.charAt(i)==s2.charAt(j)) {
                i++;
                j++;
            }
            else {
                i++;
            }

            if(j==s2.length()-1) {
                return true;
            }
        }
       return false;
    }
}
