/*
 * Given a string, return a new string where the first and last chars
 * have been exchanged
 */
public class FrontBack {
	public static void main(String[] agrs) {
		System.out.println(frontBack("code")); // "eodc"
		System.out.println(frontBack("a")); // "a"
		System.out.println(frontBack("ab")); // "ba"
		System.out.println(frontBack("abc")); // "cba"
		System.out.println(frontBack("")); // ""
		System.out.println(frontBack("Chocolate")); // "ehocolatC"
		System.out.println(frontBack("aavJ")); // "Java"
		System.out.println(frontBack("hello")); // "oellh"
	}

	public static String frontBack(String str) {
		if(str.length() <= 1) {
			return str;
		} else {
			return str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
		}
	}
}
