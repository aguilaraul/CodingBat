/**
 * Given an array length 1 or more of ints, return the difference
 * between the largest and smallest values in the array
 */
public class BigDiff {
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        
        for(int i = 0; i < nums.length-1; i++) {
        max = Math.max(max, nums[i+1]);
        }

        for(int i = 0; i < nums.length-1; i++) {
        min = Math.min(min, nums[i+1]);
        }

        return max - min;
    }
}