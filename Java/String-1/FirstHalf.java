/*
 * Given a string of even length, retun the first half.
 * So the string "WooHoo" yields "Woo".
 */
public class FirstHalf {
	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo")); // "Woo"
		System.out.println(firstHalf("HelloThere")); // "Hello"
		System.out.println(firstHalf("abcdef")); // "abc"
		System.out.println(firstHalf("a")); // "a"
		System.out.println(firstHalf("")); // ""
		System.out.println(firstHalf("0123456789")); // "01234"
		System.out.println(firstHalf("kitten")); // "kit"
	}

	public static String firstHalf(String str) {
		int half = str.length()/2;
		return str.substring(0,half);
	}
}
