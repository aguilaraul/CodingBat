/*
 * Given a string and a non-negative int n, return
 * a larger string that is n copies of the original
 * string
 */
public class StringTimes {
	public static void main(String[] agrs) {
		System.out.println(stringTimes("Hi", 2)); // "HiHi"
		System.out.println(stringTimes("Hi", 3)); // "HiHiHi"
		System.out.println(stringTimes("Hi", 1)); // "Hi"
		System.out.println(stringTimes("", 0)); // ""
		System.out.println(stringTimes("Hi", 5)); // "HiHiHiHiHi"
		System.out.println(stringTimes("Oh Boy!", 2)); // "OhBoy!OhBoy!"
		System.out.println(stringTimes("x", 4)); // "xxxx"
		System.out.println(stringTimes("", 4)); // ""
		System.out.println(stringTimes("code", 2)); // "codecode"
		System.out.println(stringTimes("code", 3)); // "codecodecode"
	}

	public static String stringTimes(String str, int n) {
		String newString = "";
		for(int i = 0; i<n;i++) {
			newString += str;
		}
		return newString;
	}

}
