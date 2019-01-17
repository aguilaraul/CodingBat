/*
 * Given an array of ints length 3, figure out which is larger,
 * the first or last element in the array, and set all the
 * other elements to be that value. Return the changed array.
 */
public int[] maxEnd3(int[] nums) {
  	int[] result = new int[3];
  	int first = nums[0];
  	int last = nums[nums.length-1];
  	int larger = first;
  	if(last > first) larger = last;

  	for(int i = 0; i < 3; i++) {
    		nums[i] = larger;
  	}
  	return nums;
}
