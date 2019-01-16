/*
 * Given a string, if one or both of the first 2 chars is 'x',
 * return the string without those 'x' chars, and otherwise
 * return the string unchanged.
 */
public class WithoutX2 {
	public static void main(String[] args) {
		System.out.println(withoutX2("xHi")); // "Hi"
		System.out.println(withoutX2("Hxi")); // "Hi"
		System.out.println(withoutX2("Hi")); // "Hi"
		System.out.println(withoutX2("xxHi")); // "Hi"
		System.out.println(withoutX2("Hix")); // "Hix"
		System.out.println(withoutX2("xaxb")); // "axb"
		System.out.println(withoutX2("xx")); // ""
		System.out.println(withoutX2("x")); // ""
		System.out.println(withoutX2("")); // ""
		System.out.println(withoutX2("Hello")); // "Hello"
		System.out.println(withoutX2("Hexllo")); // "Hexllo"
		System.out.println(withoutX2("xHxllo")); // "Hxllo"
	}

	public static String withoutX2(String str) {
	  	String result = "";
	  
	  	if(str.length() < 2) return result;
	  
	  	if(str.length() >= 1) {
	    		if(str.charAt(0) != 'x') {
	      			result += str.charAt(0);
	    		}
	  	}
	  	if((str.length() >= 2)) {
	    		if(str.charAt(1) != 'x') {
	      			result += str.charAt(1);
	    		}
	  	}
	  	result += str.substring(2);

	  	return result;
	}
}
