/*
 * Given an array of ints, return the number of 9's in the array
 */
public class ArrayCount9 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,9}; // 1
		int[] nums2 = {1,9,9}; // 2
		int[] nums3 = {1,9,9,3,9}; // 3
		int[] nums4 = {1,2,3}; // 0
		int[] nums5 = {}; // 0
		int[] nums6 = {4,2,4,3,1}; // 0
		int[] nums7 = {9,2,4,3,1}; // 1

		System.out.println(arrayCount9(nums1)); // 1
		System.out.println(arrayCount9(nums2)); // 2
		System.out.println(arrayCount9(nums3)); // 3
		System.out.println(arrayCount9(nums4)); // 0
		System.out.println(arrayCount9(nums5)); // 0
		System.out.println(arrayCount9(nums6)); // 0
		System.out.println(arrayCount9(nums7)); // 1
	}

	public static int arrayCount9(int[] nums) {
		int counter = 0;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 9) {
				counter++;
			}
		}
		return counter;
	}
}
