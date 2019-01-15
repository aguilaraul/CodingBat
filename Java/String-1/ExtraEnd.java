/*
 * Given a string, return a new string made of 3 copies of
 * the last 2 chars of the original string. The string length
 * will be at least 2.
 */
public class ExtraEnd {
	public static void main(String[] args) {
		System.out.println(extraEnd("Hello")); //"He"
		System.out.println(extraEnd("abcdefg")); //"ab"
		System.out.println(extraEnd("ab")); // "ab"
		System.out.println(extraEnd("Candy")); // "dydydy"
		System.out.println(extraEnd("Code")); // "dedede"
	}

	public static String extraEnd(String str) {
		if(str.length() == 2) {
    			return str+str+str;
  		} else {
    			String end = str.substring(str.length()-2);
    			return end+end+end;
  		}
	}
}
