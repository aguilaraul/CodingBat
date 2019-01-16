/*
 * Given a string, return a new string made of 3 copies of the
 * first 2 chars of the original string. The string may be any
 * length. If there are fewer than 2 chars, use whatever is there.
 */
public class ExtraFront {
	public static void main(String[] args) {
		System.out.println(extraFront("Hello")); // "HeHeHe"
		System.out.println(extraFront("ab")); // "ababab"
		System.out.println(extraFront("H")); // "HHH"
		System.out.println(extraFront("")); // ""
		System.out.println(extraFront("Candy")); // "CaCaCa"
		System.out.println(extraFront("Code")); // "CoCoCo"
	}

	public static String extraFront(String str) {
  		if(str.length() < 2) return str + str + str;
  		
		String front = str.substring(0,2);
  		return front + front + front;
	}
}
