/**
 * Return the number of even ints in the given array.
 */
public class CountEvens {
    public int countEvens(int[] nums) {
        int count = 0;

        for(int num:nums) {
            if(num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}