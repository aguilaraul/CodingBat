/*
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise,
 * return the string unchanged.
 */
public class DelDel {
	public static void main(String[] agrs) {
		System.out.println(delDel("adelbc")); // "abc"
		System.out.println(delDel("adelHello")); // "aHello"
		System.out.println(delDel("adedbc")); // "adedbc"
		System.out.println(delDel("abcdel")); // "abcdel"
		System.out.println(delDel("add")); // "add"
		System.out.println(delDel("ad")); // "ad"
		System.out.println(delDel("a")); // "a"
		System.out.println(delDel("")); // ""
		System.out.println(delDel("del")); // "del"
		System.out.println(delDel("adel")); // "a"
		System.out.println(delDel("aadelbb")); // "aadelbb"
	}

	public static String delDel(String str) {
		boolean containsDel = str.length() >= 4 && str.substring(1,4).equals("del");
		if(containsDel) {
			return str.substring(0,1) + str.substring(4);
		}
		return str;
	}

}
