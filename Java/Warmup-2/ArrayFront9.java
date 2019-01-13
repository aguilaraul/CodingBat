/*
 * Given an array of ints, return true if one of the first 4 elements
 * in the array is a 9. The array length may be less 4.
 */
public class ArrayFront9 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,9,3,4}; // true
		int[] nums2 = {1,2,3,4,9}; // false
		int[] nums3 = {1,2,3,4,5}; // false
		int[] nums4 = {9,2,3}; // true
		int[] nums5 = {1,9,9}; // true
		int[] nums6 = {1,2,3}; // false
		int[] nums7 = {1,9}; // true
		int[] nums8 = {5,5}; // false
		int[] nums9 = {2}; // false
		int[] nums10 = {9}; // true
		int[] nums11 = {}; // false
		int[] nums12 = {3,9,2,3,3}; // true

		System.out.println(arrayFront9(nums1));
		System.out.println(arrayFront9(nums2));
		System.out.println(arrayFront9(nums3));
		System.out.println(arrayFront9(nums4));
		System.out.println(arrayFront9(nums5));
		System.out.println(arrayFront9(nums6));
		System.out.println(arrayFront9(nums7));
		System.out.println(arrayFront9(nums8));
		System.out.println(arrayFront9(nums9));
		System.out.println(arrayFront9(nums10));
		System.out.println(arrayFront9(nums11));
		System.out.println(arrayFront9(nums12));
	}

	public static boolean arrayFront9(int[] nums) {
		if(nums.length < 4) {
    			for(int i = 0; i < nums.length; i++) {
      				if(nums[i] == 9) {
        				return true;
      				}
    			}
  		} else {
    			for(int i = 0; i < 4; i++) {
      				if(nums[i] == 9) {
        				return true;
      				}
    			}
  		}
  		return false;
	}
}
