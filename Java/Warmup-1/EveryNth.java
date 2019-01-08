/*
 * Given a non-empty string and an int N, return the string made
 * starting with char 0, and then every Nth char of the string.
 * So if N is 3, use char 0,3,6, ... and so on. N is 1 or more.
 */
public class EveryNth {
	public static void main(String[] args) {
		System.out.println(everyNth("Miracle", 2)); // "Mrce"
		System.out.println(everyNth("abcdefg", 2)); // "aceg"
		System.out.println(everyNth("abcdefg", 3)); // "adg"
		System.out.println(everyNth("Chocolate", 3)); // "Cca"
		System.out.println(everyNth("Chocolates", 3)); // "Ccas"
		System.out.println(everyNth("Chocolates", 4)); // "Coe"
		System.out.println(everyNth("Chocolates", 100)); // "C"
	}

	public static String everyNth(String str, int n) {
		String newString = "";

		for(int i = 0; i < str.length(); i+=n) {
			char nChar = str.charAt(i);
			newString += nChar;
		}

		return newString;
	}
}
