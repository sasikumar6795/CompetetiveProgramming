package stringsBased;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        indexOfNonRepeatingCharacter(str);
    }

    private static int indexOfNonRepeatingCharacter(String str) {
        int[] fIndex =  new int[256];
        int res = Integer.MAX_VALUE;
        Arrays.fill(fIndex,-1);
        for(int i=0;i<str.length();i++) {
            if(fIndex[str.charAt(i)]==-1) {
                fIndex[str.charAt(i)]=i;
            }
            else {
                fIndex[str.charAt(i)] = -2;
            }
        }
        for(int i=0;i<fIndex.length;i++) {
            if(fIndex[i]>=0) {
                res = Math.min(res,fIndex[i]);
            }
        }
        return (res==Integer.MAX_VALUE)? -1 : res;
    }
}
