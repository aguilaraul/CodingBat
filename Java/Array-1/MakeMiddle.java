/*
 * Given an array of ints of even length, return a new array
 * length 2 containing the middle two elements from the
 * original array. The original array will be length 2 or more.
 */
public int[] makeMiddle(int[] nums) {
  	int[] result = new int[2];

  	if(nums.length == 2) {
    		for(int i = 0; i < 2; i++) {
      			result[i] = nums[i];
    		}
    		return result;
  	}

  	result[0] = nums[nums.length/2-1];
  	result[1] = nums[nums.length/2];
  	return result;
}
