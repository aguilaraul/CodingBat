/*
 * Given 2 strings, a and b, return the number of the positions where
 * they contain the same length 2 substring. So "xxcaazz" and "xxbaaz"
 * yields 3, since the "xx", "aa", and "az" substrings appear in the
 * same place in both strings.
 */
public class StringMatch {
	public static void main(String[] args) {
		System.out.println(stringMatch("xxcaazz", "xxbaaz")); // 3
		System.out.println(stringMatch("abc", "abc")); // 2
		System.out.println(stringMatch("abc", "axc")); // 0
		System.out.println(stringMatch("hello", "he")); // 1
		System.out.println(stringMatch("he", "hello")); // 1
		System.out.println(stringMatch("h", "hello")); // 0
		System.out.println(stringMatch("", "hello")); // 0
		System.out.println(stringMatch("aabbccdd", "abbbxxd")); // 1
		System.out.println(stringMatch("aaxxaaxx", "iaxxai")); // 3
		System.out.println(stringMatch("iaxxai", "aaxxaaxx")); // 3
	}

	public static int stringMatch(String a, String b) {
		int shorter = Math.min(a.length(), b.length());
		int counter = 0;

		for(int i = 0; i < shorter-1; i++) {
			if(a.substring(i,i+2).equals(b.substring(i,i+2))) counter++;
		}
		return counter;
	}
}
