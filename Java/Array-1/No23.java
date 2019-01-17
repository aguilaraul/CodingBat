/*
 * Given an int array length 2, return true if it does not contain
 * a 2 or 3.
 */
public boolean has23(int[] nums) {
  	for(int numbers : nums) {
    		if(numbers == 2 || numbers == 3) return false;
  	}
  	return true;
}
