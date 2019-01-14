/*
 * Given an array of ints, return true if it contains a 2,7,1 pattern:
 * a value, followed by the value plus 5, followed by the value minus 1.
 * Additionally the 271 counts even if the "1" differs by 2 or less
 * from the correct value.
 */
public class Has271 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,7,1}; // true
		int[] nums2 = {1,2,8,1}; // false
		int[] nums3 = {2,7,1}; // true
		int[] nums4 = {3,8,2}; // true
		int[] nums5 = {2,7,3}; // true
		int[] nums6 = {2,7,4}; // false
		int[] nums7 = {2,7,-1}; // true
		int[] nums8 = {2,7,-2}; // false
		int[] nums9 = {4,5,3,8,0}; // true
		int[] nums10 = {2,7,5,10,4}; // true
		int[] nums11 = {2,7,-2,4,9,3}; // true
		int[] nums12 = {2,7,5,10,1}; // false
		int[] nums13 = {2,7,-2,4,10,2}; // false
		int[] nums14 = {1,1,4,9,0}; // false
		int[] nums15 = {1,1,4,9,4,9,2}; // true

		System.out.println(has271(nums1));
		System.out.println(has271(nums2));
		System.out.println(has271(nums3));
		System.out.println(has271(nums4));
		System.out.println(has271(nums5));
		System.out.println(has271(nums6));
		System.out.println(has271(nums7));
		System.out.println(has271(nums8));
		System.out.println(has271(nums9));
		System.out.println(has271(nums10));
		System.out.println(has271(nums11));
		System.out.println(has271(nums12));
		System.out.println(has271(nums13));
		System.out.println(has271(nums14));
		System.out.println(has271(nums15));
	}

	public static boolean has271(int[] nums) {
		for(int i = 0; i < nums.length-2; i++) {
			int value = nums[i];
			if(nums[i+1] == value+5 && (nums[i+2] >= value-3 && nums[i+2] <= value+1)) return true;
		}
		return false;
	}
}
