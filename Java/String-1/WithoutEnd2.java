/*
 * Given a string, return a version without both the first
 * and last char of the string. The string may be any length,
 * including 0.
 */
public class WithoutEnd2 {
	public static void main(String[] args) {
		System.out.println(withoutEnd2("Hello")); // "ell"
		System.out.println(withoutEnd2("abc")); // "b"
		System.out.println(withoutEnd2("ab")); // ""
	}

	public static String withoutEnd2(String str) {
		if(str.length() <= 2) return "";
		else return str.substring(1,str.length()-1);
	}
}
