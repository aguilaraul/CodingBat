/*
 * Given an array of ints length 3, return an array with the
 * elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 */
public int[] rotateLeft3(int[] nums) {
  	int[] result = new int[3];

  	int j = 0;
  	for(int i = 1; i < 4; i++) {
    		if(i == 3) {
      			result[j] = nums[0];
    		} else {
      			result[j] = nums[i];
    		}
    		j++;
  	}
  	return result;
}
