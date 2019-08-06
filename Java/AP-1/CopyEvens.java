/**
 * Given an array of positive ints, return a new array of length
 * "count" containing the first even numbers from the original
 * array. The original array will contain at least "count" even
 * numbers.
 */
class CopyEvens {

    public int[] copyEvens(int[] nums, int count) {
        int[] evens = new int[count];
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(k<count) {
                if(nums[i] % 2 == 0) {
                    evens[k] = nums[i];
                    k++;
                }
            }
        }

        return evens;
    }
}