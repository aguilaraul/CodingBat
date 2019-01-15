/*
 * Suppose the string "yak" is unlucky. Given a string, return
 * a version where all the "yak" are removed, but the "a" can
 * be any char. The "yak" strings will not overlap.
 */
public class StringYak {
	public static void main(String[] args) {
		System.out.println(stringYak("yakpak")); //"pak"
		System.out.println(stringYak("pakyak")); //"pak"
		System.out.println(stringYak("yak123ya")); // "123ya"
		System.out.println(stringYak("yak")); // ""
		System.out.println(stringYak("yakxxxyak")); //"xxx"
		System.out.println(stringYak("HiyakHi")); //"HiHi"
		System.out.println(stringYak("xxxyakyyyakzzz")); //"xxxyyzzz"
	}

	public static String stringYak(String str) {
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') i+=2;
			else result += str.charAt(i);
		}

		return result;
	}
}
