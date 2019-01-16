/*
 * Given 2 strings, a and b, return a string of the form
 * short+long+short, with the shorter string on the outside
 * and the longer string on the inside. The strings will not
 * be the same length, but they may be empty (length 0).
 */
public class ComboString {
	public static void main(String[] args) {
		System.out.println(comboString("Hello", "hi")); // "hiHelloHi"
		System.out.println(comboString("hi", "Hello")); // "hiHelloHi"
		System.out.println(comboString("aaa", "b")); // "baaab"
		System.out.println(comboString("b", "aaa")); // "baaab"
		System.out.println(comboString("aaa", "")); // "aaa"
		System.out.println(comboString("", "bb")); // "bb"
		System.out.println(comboString("aaa", "1234")); // "aaa1234aaa"
		System.out.println(comboString("aaa", "bb")); // "bbaaabb"
		System.out.println(comboString("a", "bb")); // "abba"
		System.out.println(comboString("bb", "a")); // "abba"
		System.out.println(comboString("xyz", "ab")); // "abxyzab"
	}

	public static String comboString(String a, String b) {
		if(a.length() < b.length()) return a + b + a;
		else return b + a + b;
	}
}
