/*
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second
 * char if it is 'b'. The string may be any length.
 */
public class DeFront {
	public static void main(String[] args) {
		System.out.println(deFront("Hello")); // "llo"
		System.out.println(deFront("java")); // "va"
		System.out.println(deFront("away")); // "aay"
		System.out.println(deFront("axy")); // "ay"
		System.out.println(deFront("abc")); // "abc"
		System.out.println(deFront("xby")); // "by"
		System.out.println(deFront("ab")); // "ab"
		System.out.println(deFront("ax")); // "a"
		System.out.println(deFront("axb")); // "ab"
		System.out.println(deFront("aaa")); // "aa"
		System.out.println(deFront("xbc")); // "bc"
		System.out.println(deFront("bbb")); // "bb"
		System.out.println(deFront("bazz")); // "zz"
		System.out.println(deFront("ba")); // ""
		System.out.println(deFront("abxyz")); // "abxyz"
		System.out.println(deFront("hi")); // ""
		System.out.println(deFront("his")); // "s"
		System.out.println(deFront("xz")); // ""
		System.out.println(deFront("zzz")); // "z"
	}

	public static String deFront(String str) {
		String result = "";
		
		if(str.length() >= 1) {
    			if(str.charAt(0) == 'a') {
      				result += 'a';
    			}
  		}
  		if((str.length() >= 2)) {
    			if(str.charAt(1) == 'b') {
      				result += 'b';
    			}
  		}
  
  		result += str.substring(2);

  		return result;
	}
}
