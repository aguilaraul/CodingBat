/*
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 */
public class StringX {
	public static void main(String[] args) {
		System.out.println(stringX("xxHxix")); // "xHix"
		System.out.println(stringX("abxxxcd")); // "abcd"
		System.out.println(stringX("xabxxxcdx")); // "xabcdx"
		System.out.println(stringX("xKittenx")); // "xKittenx"
		System.out.println(stringX("Hello")); // "Hello"
		System.out.println(stringX("xx")); // "xx"
		System.out.println(stringX("x")); // "x"
		System.out.println(stringX("")); // ""
	}

	public static String stringX(String str) {
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			if( (i == 0 || i == str.length()-1) && str.charAt(i) == 'x') {
				result += str.charAt(i);
			}
			if(str.charAt(i) != 'x') {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
