/*
 * Given 2 positive int values, return the larger value that is in the range
 * 10..20 inclusive, or return 0 if neither is in that range
 */
public class Max1020 {
	public static void main(String[] args) {
		System.out.println(max1020(11,19)); // 19
		System.out.println(max1020(19,11)); // 19
		System.out.println(max1020(11,9)); // 11
		System.out.println(max1020(9,21)); // 0
		System.out.println(max1020(10,21)); // 10
		System.out.println(max1020(21,10)); // 10
		System.out.println(max1020(9,11)); // 11
		System.out.println(max1020(23,10)); // 10
		System.out.println(max1020(20,10)); // 20
		System.out.println(max1020(7,20)); // 20
		System.out.println(max1020(17,16)); // 17
	}

	public static int max1020(int a, int b) {
		if(a >= 10 && a <= 20) {
			if(b >= 10 && b <= 20) {
				if(b>a) {
					return b;
				}
			}
			return a;
		} else {
			if(b >= 10 && b <= 20) {
				return b;
			}
		}
		return 0;
	}
}
