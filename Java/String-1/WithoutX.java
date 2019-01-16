/*
 * Given a string, if the first or last chars are 'x', return
 * the string without those 'x' chars, and otherwise return
 * the string unchanged.
 */
public class WithoutX {
	public static void main(String[] args) {
		System.out.println(withoutX("xHix")); // "Hi"
		System.out.println(withoutX("xHi")); // "Hi"
		System.out.println(withoutX("Hxix")); // "Hxi"
		System.out.println(withoutX("Hi")); // "Hi"
		System.out.println(withoutX("xxHi")); // "xHi"
		System.out.println(withoutX("Hix")); // "Hi"
		System.out.println(withoutX("xaxbx")); // "axb"
		System.out.println(withoutX("xx")); // ""
		System.out.println(withoutX("x")); // ""
		System.out.println(withoutX("")); // ""
		System.out.println(withoutX("Hello")); // "Hello"
		System.out.println(withoutX("Hexllo")); // "Hexllo"
	}

	public static String withoutX(String str) {
		String result = "";

		if(str.length() < 2) return result;

		if(str.charAt(0) == 'x')		result += str.substring(1,str.length()-1);
		else 					result += str.substring(0,str.length()-1);
		if(str.charAt(str.length()-1) == 'x')	return result;
		else 					return result + str.charAt(str.length()-1);
	}
}
