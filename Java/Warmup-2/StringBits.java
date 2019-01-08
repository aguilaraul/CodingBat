/*
 * Given a string, return a new string made of every other char
 * starting with the first, so "Hello" yields "Hlo".
 */
public class StringBits {
	public static void main(String[] args) {
		System.out.println(stringBits("Hello")); // "Hlo"
		System.out.println(stringBits("Hi")); // "H"
		System.out.println(stringBits("Heeololeo")); // "Hello"
		System.out.println(stringBits("HiHiHi")); // "HHH"
		System.out.println(stringBits("")); // ""
		System.out.println(stringBits("Greetings")); // "Getns"
		System.out.println(stringBits("Chocolate")); // "Cooae"
		System.out.println(stringBits("pi")); // "p"
		System.out.println(stringBits("Hello Kitten")); // "HloKte"
		System.out.println(stringBits("hxaxpxpxy")); // "happy"
	}

	public static String stringBits(String str) {
		String newString = "";
		for(int i = 0; i < str.length(); i+=2) {
			newString += str.charAt(i);
		}
		return newString;
	}
}
