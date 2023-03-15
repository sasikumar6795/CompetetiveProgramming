package stringsBased;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {

        int arr[] = {2,7,11,13,15};
        //int[] resultArray = twoSum(arr, 9);
        int[] resultArray = twoSum2(arr, 9);
        for(int i=0;i<resultArray.length;i++) {
            System.out.println(resultArray[i]);
        }
    }

    private static int[] twoSum2(int[] arr, int target) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            Integer complementIndex = result.get(arr[i]);
            if(complementIndex!=null) {
                return new int[] {i,complementIndex};
            }
            result.put(target-arr[i],i);
        }
        return arr;
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return arr;
    }
}
