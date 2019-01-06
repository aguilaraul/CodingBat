/*
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */
public class Diff21 {
	public static void main(String[] args) {
		System.out.println(diff21(19)); // 2
		System.out.println(diff21(10)); // 11
		System.out.println(diff21(21)); // 0
		System.out.println(diff21(22)); // 2
		System.out.println(diff21(25)); // 8
		System.out.println(diff21(30)); // 18
		System.out.println(diff21(0));  // 21
		System.out.println(diff21(1));  // 20
		System.out.println(diff21(2));  // 19
		System.out.println(diff21(-1)); // 22
		System.out.println(diff21(-2)); // 23
		System.out.println(diff21(50)); // 58
	}

	public static int diff21(int n) {
		if(n > 21) {
			return (n-21)*2;
		} else {
			return (21-n);
		}
	}
}
