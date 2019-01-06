/*
 * Given a string, return a new string where "not" has been added to the front.
 * However, if the string already begins with "not", return the string
 * unchanged. Note: use .equals() to compare 2 strings.
 */
public class NotString {
	public static void main(String[] args) {
		System.out.println(notString("candy")); // "not candy"
		System.out.println(notString("x")); // "not x"
		System.out.println(notString("not bad")); // "not bad"
		System.out.println(notString("bad")); // "not bad"
		System.out.println(notString("not")); // "not"
		System.out.println(notString("is not")); // "not is not"
		System.out.println(notString("no")); // "not no"
	}

	public static String notString(String str) {
		if(str.length() >= 3) {
			if(str.substring(0,3).equals("not")) {
				return str;
			} else {
				return "not "+str;
			}
		} else {
			return "not "+str;
		}
	}
}

