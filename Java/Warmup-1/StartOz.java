/*
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second
 * only if it is 'z', so "ozymandias" yields "oz".
 */
public class StartOz {
	public static void main(String[] agrs) {
		System.out.println(startOz("ozymandias")); // "oz"
		System.out.println(startOz("bzoo")); // "z"
		System.out.println(startOz("oxx")); // "o"
		System.out.println(startOz("oz")); // "oz"
		System.out.println(startOz("ounce")); // "o"
		System.out.println(startOz("o")); // "o"
		System.out.println(startOz("abc")); // ""
		System.out.println(startOz("")); // ""
		System.out.println(startOz("zoo")); // ""
		System.out.println(startOz("aztec")); // "z"
		System.out.println(startOz("zzzz")); // "z"
		System.out.println(startOz("oznic")); // "oz"
	}

	public static String startOz(String str) {
		String oz = "";

		if(str.length() >= 1) {
			if(str.charAt(0) == 'o') {
				oz += 'o';
			}
		}
		if(str.length() >= 2) {
			if(str.charAt(1) == 'z') {
				oz += 'z';
			}
		}
		return oz;
	}
}
