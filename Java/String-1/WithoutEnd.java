/*
 * Given a string, return a version without the first and last char, so
 * "Hello" yields "ell". The string length will be at least 2.
 */
public class WithoutEnd {
	public static void main(String[] args) {
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
	}

	public static String withoutEnd(String str) {
		String result = "";
		for(int i = 1; i < str.length()-1; i++) result += str.charAt(i);
		return result;
	}
}
