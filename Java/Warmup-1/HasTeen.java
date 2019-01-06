/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 */
public class HasTeen {
	public static void main(String[] agrs) {
		System.out.println(hasTeen(13, 20, 10)); //true
		System.out.println(hasTeen(20, 19, 10)); //true
		System.out.println(hasTeen(20, 10, 13)); //true
		System.out.println(hasTeen(1, 20, 12)); //false
		System.out.println(hasTeen(19, 20, 12)); //true
		System.out.println(hasTeen(12, 20, 19)); //true
		System.out.println(hasTeen(12, 9, 20)); //false
		System.out.println(hasTeen(12, 18, 20)); //true
		System.out.println(hasTeen(14, 2, 20)); //true
		System.out.println(hasTeen(4, 2, 20)); //false
		System.out.println(hasTeen(11, 22, 22)); //false
	}

	public static boolean hasTeen(int a, int b, int c) {
		return (a >= 13 && a <=19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
	}

}
