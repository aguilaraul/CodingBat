/*
 * Given a string, take the last char and return a new string with
 * the last char added at the front and back, so "cat" yields "tcatt".
 * The original string will be length 1 or more.
 */
public class BackAround {
	public static void main(String[] agrs) {
		System.out.println(backAround("cat")); //"tcatt"
		System.out.println(backAround("Hello")); //"oHelloo"
		System.out.println(backAround("a")); //"aaa"
		System.out.println(backAround("abc")); //"cabcc"
		System.out.println(backAround("read")); //"dreadd"
		System.out.println(backAround("boo")); //"obooo"
	}

	public static String backAround(String str) {
		char last = str.charAt(str.length()-1);
		return last+str+last;
	}
}
