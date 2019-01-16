public class MinCat {
	public static void main(String[] args) {
		System.out.println(minCat("Hello", "Hi")); // "loHi"
		System.out.println(minCat("Hello", "java")); // "ellojava"
		System.out.println(minCat("java", "Hello")); // "javaello"
		System.out.println(minCat("abc", "x")); // "cx"
		System.out.println(minCat("x", "abc")); // "xc"
		System.out.println(minCat("abc", "")); // ""
	}

	public static String minCat(String a, String b) {
		if(a.length() == b.length()) return a + b;
		
		int shorter = Math.min(a.length(), b.length());
		return a.substring(a.length()-shorter) + b.substring(b.length()-shorter);
	}
}
