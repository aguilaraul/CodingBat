/*
 * Given a string, if the string begins with "red" or "blue"
 * return that color string, otherwise return the empty string.
 */
public class SeeColor {
	public static void main(String[] args) {
		System.out.println(seeColor("redxx")); // "red"
		System.out.println(seeColor("xxred")); // ""
		System.out.println(seeColor("blueTimes")); // "blue"
		System.out.println(seeColor("NoColor")); // ""
		System.out.println(seeColor("red")); // "red"
		System.out.println(seeColor("re")); // ""
		System.out.println(seeColor("blu")); // ""
		System.out.println(seeColor("blue")); // "blue"
		System.out.println(seeColor("a")); // ""
		System.out.println(seeColor("")); // ""
		System.out.println(seeColor("xyzred")); // ""
	}

	public static String seeColor(String str) {
		if(str.length() >= 3 && str.substring(0,3).equals("red")) return "red";
		if(str.length() >= 4 && str.substring(0,4).equals("blue")) return "blue";
		return "";
	}
}