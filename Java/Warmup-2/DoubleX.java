/*
 * Given a string, return true if the first instance of 'x' in
 * the string is immediately followed by another 'x'.
 */
public class DoubleX {
	public static void main(String[] args) {
		System.out.println(doubleX("axxbb")); // true
		System.out.println(doubleX("axaxax")); // false
		System.out.println(doubleX("xxxxx")); // true
		System.out.println(doubleX("xaxxx")); // false
		System.out.println(doubleX("aaaax")); // false
		System.out.println(doubleX("")); // false
		System.out.println(doubleX("abc")); // false
		System.out.println(doubleX("x")); // false
		System.out.println(doubleX("xx")); // true
		System.out.println(doubleX("xax")); // false
		System.out.println(doubleX("xaxx")); // false
	}

	public static boolean doubleX(String str) {
		int firstXAt = str.indexOf('x');

		if(firstXAt+1 == str.length()) {
			return false;
		}
		if(str.charAt(firstXAt+1) == 'x') {
			return true;
		}
		return false;
	}
}
