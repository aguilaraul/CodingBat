/*
 * Given an array of ints, we'll say that a triple is a value
 * appearing 3 times in a row in the array. Return true if the
 * array does not contain any triples.
 */
public class NoTriples {
	public static void main(String[] args) {
		int[] nums1 = {1,1,2,2,1}; // true
		int[] nums2 = {1,1,2,2,2,1}; // false
		int[] nums3 = {1,1,1,2,2,2,1}; // false
		int[] nums4 = {1,1,2,2,1,2,1}; // true
		int[] nums5 = {1,2,1}; // true
		int[] nums6 = {1,1,1}; // false
		int[] nums7 = {1,1}; // true
		int[] nums8 = {1}; // true
		int[] nums9 = {}; // true

		System.out.println(noTriples(nums1));
		System.out.println(noTriples(nums2));
		System.out.println(noTriples(nums3));
		System.out.println(noTriples(nums4));
		System.out.println(noTriples(nums5));
		System.out.println(noTriples(nums6));
		System.out.println(noTriples(nums7));
		System.out.println(noTriples(nums8));
		System.out.println(noTriples(nums9));
	}

	public static boolean noTriples(int[] nums) {
		for(int i = 0; i < nums.length-2; i++) {
			if(nums[i] == nums[i] && nums[i+1] == nums[i] && nums[i+2] == nums[i]) return false;
		}
		return true;
	}
}
