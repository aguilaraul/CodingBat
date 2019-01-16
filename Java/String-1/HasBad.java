/*
 * Given a string, return true if "bad" appears starting at
 * index 0 or 1 in the string, such as with "badxxx" or
 * "xbadxx" but not "xxbadxx". The string may be any length,
 * including 0.
 */
public class HasBad {
	public static void main(String[] args) {
		System.out.println(hasBad("badxx")); //true
		System.out.println(hasBad("xbadxx")); // true
		System.out.println(hasBad("xxbadxx")); // false
		System.out.println(hasBad("code")); // false
		System.out.println(hasBad("bad")); // true
		System.out.println(hasBad("ba")); // false
		System.out.println(hasBad("xba")); // false
		System.out.println(hasBad("xbad")); // true
		System.out.println(hasBad("")); // false
		System.out.println(hasBad("badyy")); // true
	}

	public static boolean hasBad(String str) {
		if((str.length() >= 3 && str.substring(0,3).equals("bad")) ||
			str.length() > 3 && str.substring(1,4).equals("bad"))
				return true;
  		return false;
	}
}
