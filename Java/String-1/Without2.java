/*
 * Given a string, if a length 2 substring appears at both
 * its beginning and end, return a string without the
 * substring at the beginning, so "HelloHe" yields "lloHe".
 * The substring may overlap with itself, so "Hi" yields "".
 * Otherwise, return the original string unchanged.
 */
public class Without2 {
	public static void main(String[] args) {
		System.out.println(without2("HelloHe")); // "lloHe"
		System.out.println(without2("HelloHi")); // "HelloHi"
		System.out.println(without2("Hi")); // ""
		System.out.println(without2("Chocolate")); // "Chocolate"
		System.out.println(without2("xxx")); // "x"
		System.out.println(without2("xx")); // ""
		System.out.println(without2("x")); // "x"
		System.out.println(without2("")); // ""
		System.out.println(without2("Fruits")); // "Fruits"
	}

	public static String without2(String str) {
		if(str. length() >= 2 && str.substring(0,2).equals(str.substring(str.length()-2)))
			return str.substring(2);
  		return str;
	}
}