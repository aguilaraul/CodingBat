/*
 * Return true if the given non-negative number is 1 or 2 less than
 * a multiple of 20. So for example 38 and 39 return true, but 40
 * returns false.
 */
public class Less20 {
	public static void main(String[] args) {
		int[] nums = {18,19,20,8,17,23,25,30,31,58,59,60,61,62,
			1017, 1018,1019,1020,1021,1022,1023,37};
		for(int number : nums) {
			System.out.println(less20(number));
		}
	}

	public static boolean less20(int n) {
		if(Math.abs(n%20 - 20) <= 2) return true;
		return false;
	}
}
