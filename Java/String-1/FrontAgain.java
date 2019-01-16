/*
 * Given a string, return true if the first 2 chars in the
 * string also appear at the end of the string, such as with
 * "edited".
 */
public class FrontAgain {
	public static void main(String[] args) {
		System.out.println(frontAgain("edited")); // true
		System.out.println(frontAgain("edit")); // false
		System.out.println(frontAgain("ed")); // true
		System.out.println(frontAgain("jj")); // true
		System.out.println(frontAgain("jjj")); // true
		System.out.println(frontAgain("jjjj")); // true
		System.out.println(frontAgain("jjjk")); // false
		System.out.println(frontAgain("x")); // false
		System.out.println(frontAgain("")); // false
		System.out.println(frontAgain("java")); // false
		System.out.println(frontAgain("javaja")); // true
	}

	public static boolean frontAgain(String str) {
		if(str.length() >= 2 && str.substring(0,2).equals(str.substring(str.length()-2))) return true;
		return false;
	}
}