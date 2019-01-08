/*
 * Return true if the given string begins with "mix",
 * except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
public class MixStart {
	public static void main(String[] agrs) {
		System.out.println(mixStart("mix snacks")); // true
		System.out.println(mixStart("pix snacks")); // true
		System.out.println(mixStart("piz snacks")); // false
		System.out.println(mixStart("nix")); // true
		System.out.println(mixStart("ni")); // false
		System.out.println(mixStart("n")); // false
		System.out.println(mixStart("")); // false
	}

	public static boolean mixStart(String str) {
		return str.length() >= 3 && str.substring(1,3).equals("ix");
	}

}