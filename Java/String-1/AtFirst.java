/*
 * Given a string, return a string length 2 made of its
 * first 2 chars. If the string length is less than 2,
 * use '@' for the missing chars.
 */
public class AtFirst {
	public static void main(String[] args) {
		System.out.println(atFirst("hello")); // "he"
		System.out.println(atFirst("hi")); // "hi"
		System.out.println(atFirst("h")); // "h@"
		System.out.println(atFirst("")); // "@@"
		System.out.println(atFirst("kitten")); // "ki"
		System.out.println(atFirst("java")); // "ja"
		System.out.println(atFirst("j")); // "j@"
	}

	public static String atFirst(String str) {
		if(str.length() == 0) return "@@";
		if(str.length() < 2) return str+'@';
		return str.substring(0,2);
	}
}
