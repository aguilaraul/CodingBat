/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 */
public class LoneTeen {
	public static void main(String[] agrs) {
		System.out.println(loneTeen(13, 99)); // true
		System.out.println(loneTeen(21, 19)); // true
		System.out.println(loneTeen(13, 13)); // false
		System.out.println(loneTeen(14, 20)); // true
		System.out.println(loneTeen(20, 15)); // true
		System.out.println(loneTeen(16, 17)); // false
		System.out.println(loneTeen(16, 9)); // true
		System.out.println(loneTeen(16, 18)); // false
		System.out.println(loneTeen(13, 19)); // false
		System.out.println(loneTeen(13, 20)); // true
		System.out.println(loneTeen(6, 18)); // true
		System.out.println(loneTeen(99, 13)); // true
		System.out.println(loneTeen(99, 99)); // false
	}

	public static boolean loneTeen(int a, int b) {
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);

		return (!aTeen && bTeen) || (aTeen && !bTeen);
	}
}
