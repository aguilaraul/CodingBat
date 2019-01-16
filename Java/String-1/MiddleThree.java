/*
 * Given a string of odd length, return the string length 3 from its middle,
 * so "Candy" yields "and". The string length will be at least 3.
 */
public class MiddleThree {
	public static void main(String[] args) {
		System.out.println(middleThree("Candy")); // "and"
		System.out.println(middleThree("and")); // "and"
		System.out.println(middleThree("solving")); // "lvi"
		System.out.println(middleThree("Hi yet Hi")); // "yet"
		System.out.println(middleThree("java yet java")); // "yet"
		System.out.println(middleThree("Chocolate")); // "col"
		System.out.println(middleThree("XabcxyzabcX")); // "xyz"
	}

	public static String middleThree(String str) {
		int l = str.length();
		
		String result = "";
		result += str.substring((l/2)-1,(l/2)+2);

		return result;
	}
}
