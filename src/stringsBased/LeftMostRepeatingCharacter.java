package stringsBased;

import java.util.Arrays;

import static java.lang.Math.min;


public class LeftMostRepeatingCharacter {

    public static void main(String[] args) {
        final int CHAR = 256;
        String s1 = "abccbd";
        int []fIndex =  new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;

        System.out.println(extracted(fIndex,s1, res));
    }

    private static int extracted(int []fIndex, String s1, int res ) {
        for(int i = 0; i< s1.length(); i++) {
            int fi = fIndex[s1.charAt(i)];
            if(fi == -1) {
               fIndex[s1.charAt(i)]= i;
            }
            else{
                res = Math.min(res, fi);
            }
        }
        return  res == Integer.MAX_VALUE ? -1 : res;
    }
}
