/**
 * Given an array of int, return the number of times that two 6's
 * are next to each other in the array. Also count instances where
 * the second "6" is actually a "7".
 */
public class Array667 {
	public static void main(String[] args) {
		int[] nums1 = {6,6,2}; // 1
		int[] nums2 = {6,6,2,6}; // 1
		int[] nums3 = {6,7,2,6}; // 1
		int[] nums4 = {6,6,2,6,7}; // 2
		int[] nums5 = {1,6,3}; // 0
		int[] nums6 = {6,1}; // 0
		int[] nums7 = {}; // 0
		int[] nums8 = {3,6,7,6}; // 1
		int[] nums9 = {3,6,6,7}; // 2
		int[] nums10 = {6,3,6,6}; // 1
		int[] nums11 = {6,7,6,6}; // 2
		int[] nums12 = {1,2,3,5,6}; // 0
		int[] nums13 = {1,2,3,6,6}; // 1

		System.out.println(array667(nums1));
		System.out.println(array667(nums2));
		System.out.println(array667(nums3));
		System.out.println(array667(nums4));
		System.out.println(array667(nums5));
		System.out.println(array667(nums6));
		System.out.println(array667(nums7));
		System.out.println(array667(nums8));
		System.out.println(array667(nums9));
		System.out.println(array667(nums10));
		System.out.println(array667(nums11));
		System.out.println(array667(nums12));
		System.out.println(array667(nums13));
	}

	public static int array667(int[] nums) {
		int counter = 0;

		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) counter++;
		}

		return counter;
	}
}
