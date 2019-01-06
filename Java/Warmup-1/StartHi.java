/*
 * Given a string, return true if the string starts with "hi"
 * and false otherwise.
 */
public class StartHi {
	public static void main(String[] agrs) {
		System.out.println(startHi("hi there")); //true
		System.out.println(startHi("hi")); //true
		System.out.println(startHi("hello hi")); //true
		System.out.println(startHi("he")); //true
		System.out.println(startHi("h")); //true
		System.out.println(startHi("")); //true
		System.out.println(startHi("ho hi")); //true
		System.out.println(startHi("hi ho")); //true
	}

	public static boolean startHi(String str) {
		if (str.length() <= 2) {
			return str.equals("hi");
		}
		return str.substring(0,2).equals("hi");
	}
}
