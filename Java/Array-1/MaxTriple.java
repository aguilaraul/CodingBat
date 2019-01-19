/*
 * Given an array of ints of odd length, look at the first, last,
 * and middle values in the array and return the largest. The
 * array length will be a least 1.
 */
public int maxTriple(int[] nums) {
	int first = nums[0];
	int middle = nums[nums.length/2];
	int last = nums[nums.length-1];

	int larger = Math.max(first, middle);
	if(larger < last) larger = last;

	return larger;
}
