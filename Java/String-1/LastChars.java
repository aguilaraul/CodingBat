/*
 * Given 2 strings, a and b, return a new string made of the
 * first char of a and the last char of b, so "yo" and "java"
 * yields "ya". If either string is length 0, use '@' for its
 * missing char.
 */
public class LastChars {
	public static void main(String[] args) {
		System.out.println(lastChars("last", "chars")); // "ls"
		System.out.println(lastChars("yo", "java")); // "ya"
		System.out.println(lastChars("hi", "")); // "h@"
		System.out.println(lastChars("", "hello")); // "@o"
		System.out.println(lastChars("", "")); // "@@"
		System.out.println(lastChars("kitten", "hi")); // "ki"
		System.out.println(lastChars("k", "zip")); // "kip"
		System.out.println(lastChars("kitten", "")); // "k@"
		System.out.println(lastChars("kitten", "zip")); // "kp"
	}

	public static String lastChars(String a, String b) {
		if(a.length() == 0) a += '@';
  		if(b.length() == 0) b += '@';
  		return "" + a.charAt(0) + b.charAt(b.length()-1);
	}
}