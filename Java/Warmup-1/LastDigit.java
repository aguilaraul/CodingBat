/*
 * Given two non-negative int values, return true if they have the same
 * last digit, such as with 27 and 57.
 */
public class LastDigit {
	public static void main(String[] args) {
		System.out.println(lastDigit(7,17)); // true
		System.out.println(lastDigit(6,17)); // false
		System.out.println(lastDigit(3,113)); // true
		System.out.println(lastDigit(114,113)); // false
		System.out.println(lastDigit(114,4)); // true
		System.out.println(lastDigit(10,0)); // true
		System.out.println(lastDigit(11,0)); // false
	}

	public static boolean lastDigit(int a, int b) {
		if( a%10 == b%10) {
			return true;
		}
		return false;
	}
}

