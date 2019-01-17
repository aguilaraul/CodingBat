/*
 * Given an array of ints length 3, return a new array with the
 * elements in reverse order, so {1,2,3} becomes {3,2,1}.
 */
public int[] reverse3(int[] nums) {
  	int[] result = new int[3];

  	int j = 0;
  	for(int i = 2; i > -1; i--) {
    		result[j] = nums[i];
    		j++;
  	}
  	return result;
}
