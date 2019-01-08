/*
 * Given a string, return a new string where the last 3 chars are
 * now in uppercase. If the string has less than 3 chars, uppercase
 * whatever is there.
 */
public class EndUp {
	public static void main(String[] args) {
		System.out.println(endUp("Hello")); // "HeLLO"
		System.out.println(endUp("hi there")); // "hi thERE"
		System.out.println(endUp("hi")); // "HI"
		System.out.println(endUp("woo hoo")); // "woo HOO"
		System.out.println(endUp("xyz12")); // "xyZ12"
		System.out.println(endUp("x")); // "X"
		System.out.println(endUp("")); // ""
	}

	public static String endUp(String str) {
		int length = str.length();
		
		if(length < 3) {
			return str.toUpperCase();
		} else {
			String front = str.substring(0,length-3);
			return front+str.substring(length-3).toUpperCase();
		}
	}
}
