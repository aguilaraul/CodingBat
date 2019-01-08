/*
 * Given 2 int values, return whichever value is nearest
 * to the value 10, or return 0 in the event of a tie.
 */
public class Close10 {
	public static void main(String[] agrs) {
		System.out.println(close10(8,13)); // 8
		System.out.println(close10(13,8)); // 8
		System.out.println(close10(13,7)); // 0
		System.out.println(close10(7,13)); // 0
		System.out.println(close10(9,13)); // 9
		System.out.println(close10(13,8)); // 8
		System.out.println(close10(10,12)); // 10
		System.out.println(close10(11,10)); // 10
		System.out.println(close10(5,21)); // 5
		System.out.println(close10(0,20)); // 0
		System.out.println(close10(10,10)); // 0
	}

	public static int close10(int a, int b) {
		int diffA = Math.abs(a-10);
		int diffB = Math.abs(b-10);
		if(diffA > diffB) {
			return b;
		} else if(diffA == diffB) {
			return 0;
		}
		return a;
	}
}
