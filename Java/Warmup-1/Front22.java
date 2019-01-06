/*
 * Given a string, take the first 2 chars and return the string
 * with the 2 chars added at both the front and back, so "kitten"
 * yields "kikittenki". If the string length is less than 2,
 * use whatever chars are there.
 */
public class Front22 {
	public static void main(String[] agrs) {
		System.out.println(front22("kitten")); // "kikittenki"
		System.out.println(front22("Ha")); // "HaHaHa"
		System.out.println(front22("abc")); // "ababcab"
		System.out.println(front22("ab")); // "ababab"
		System.out.println(front22("a")); // "a"
		System.out.println(front22("")); // ""
		System.out.println(front22("Logic")); // "LoLogicLo"
	}

	public static String front22(String str) {
		if(str.length() < 2 ) {
			return str+str+str;
		} else {
			String front2 = str.substring(0,2);
			return front2+str+front2;
		}
	}
}
