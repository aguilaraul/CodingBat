/*
 * Given a string and an index, return a string length 2
 * starting at the given index. If the index is too big or
 * too small to define a string length 2, use the first 2
 * chars. The string length will be at least 2.
 */
public class TwoChar {
	public static void main(String[] args) {
		System.out.println(twoChar("java", 0)); // ja
		System.out.println(twoChar("java", 2)); // va
		System.out.println(twoChar("java", 3)); // ja
		System.out.println(twoChar("java", 4)); // ja
		System.out.println(twoChar("java",-1)); // ja
		System.out.println(twoChar("Hello",0)); // He
		System.out.println(twoChar("Hello",1)); // el
		System.out.println(twoChar("Hello",99)); // He
		System.out.println(twoChar("Hello", 3)); // lo
		System.out.println(twoChar("Hello", 4)); // He
		System.out.println(twoChar("Hello", 5)); // He
		System.out.println(twoChar("Hello",-7)); // He
		System.out.println(twoChar("Hello", 6)); // He
		System.out.println(twoChar("Hello",-1)); // He
		System.out.println(twoChar("yay", 0)); // "ya"
	}

	public static String twoChar(String str, int index) {
		if(index+2 > str.length() || index < 0) return str.substring(0,2);
   		return str.substring(index,index+2);
	}
}
