/*
 * Given a non-empty string like "Code" return a string like "CCoCodCode"
 */
public class StringSplosion {
	public static void main(String[] args) {
		System.out.println(stringSplosion("Code")); // "CCoCodCode"
		System.out.println(stringSplosion("abc")); // "aababc"
		System.out.println(stringSplosion("ab")); // "aab"
		System.out.println(stringSplosion("x")); // "x"
		System.out.println(stringSplosion("fade")); // "ffafadfade"
		System.out.println(stringSplosion("There")); // "TThTheTherThere"
		System.out.println(stringSplosion("Kitten")); // "KKiKitKittKitteKitten"
		System.out.println(stringSplosion("Bye")); // "BByBye"
		System.out.println(stringSplosion("Good")); // "GGoGooGood"
		System.out.println(stringSplosion("Bad")); // "BBaBad"
	}

	public static String stringSplosion(String str) {
		String newString = "";
		for(int i = 0; i < str.length(); i++) {
			newString += str.substring(0, i+1);
		}
		return newString;
	}
}
