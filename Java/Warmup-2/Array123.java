/*
 * Given an array of ints, return true if the sequence of
 * numbers 1,2,3 appears in the array somewhere.
 */
public class Array123 {
	public static void main(String[] args) {
		int[] array1 = {1,1,2,3,1}; // true
		int[] array2 = {1,1,2,4,1}; // false
		int[] array3 = {1,1,2,1,2,3}; // true
		int[] array4 = {1,1,2,1,2,1}; // false
		int[] array5 = {1,2,3,1,2,3}; // true
		int[] array6 = {1,2,3}; // true
		int[] array7 = {1,1,1}; // false
		int[] array8 = {1,2}; // false
		int[] array9 = {1}; // false
		int[] array10 = {}; // false

		System.out.println(array123(array1));
		System.out.println(array123(array2));
		System.out.println(array123(array3));
		System.out.println(array123(array4));
		System.out.println(array123(array5));
		System.out.println(array123(array6));
		System.out.println(array123(array7));
		System.out.println(array123(array8));
		System.out.println(array123(array9));
		System.out.println(array123(array10));
	}

	public static boolean array123(int[] nums) {
	  for(int i = 0; i < nums.length-2; i++) {
	    if( nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
	  }
	  return false;
	}

	public static boolean array123Solution2(int[] nums) {
	  int temp = 1;
	  
	  for(int i = 0; i < nums.length; i++) {
	    if(nums[i] == temp) {
	      temp++;
	    }
	  }
	  if(temp == 4) {
	    return true;
	  }
	  
	  return false;
	}

}
