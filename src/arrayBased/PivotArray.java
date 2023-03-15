package arrayBased;

public class PivotArray {

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }


    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        for(int i=0; i<nums.length ; i++) {
            if(leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum +=nums[i];
        }
        return -1;

    }
}
