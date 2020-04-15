/**
 * Given an array of ints, return true if the sum of all
 * the 2s in the array is exactly 8.
 */
public class Sum28 {
    public boolean sum28(int[] nums) {
        int count = 0;

        for(int n : nums) {
            if(n == 2) {
                count++;
            }
        }

        return count*2 == 8;
    }
}