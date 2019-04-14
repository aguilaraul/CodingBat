/**
 * Return the "centered" average of an array of ints, which we'll say
 * is the mean average of the values, except ignoring the largest and
 * smallest values in the array. If there are multiple copies of the
 * smallest value, ignore just one copy, and likewise for the largest
 * value.
 */

import java.util.Arrays;

public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int items = 0;
        Arrays.sort(nums);

        for(int i = 1; i < nums.length-1; i++) {
            sum += nums[i];
            items++;
        }

        return (sum/items);
    }
}