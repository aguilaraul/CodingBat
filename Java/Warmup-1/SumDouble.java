/*
 * Given two int values, return their sum. Unless the two values
 * are the same, then return double their sum.
 */
public class SumDouble {
	public static void main(String[] args) {
		System.out.println(sumDouble(1,2)); // 3
		System.out.println(sumDouble(3,2)); // 5
		System.out.println(sumDouble(2,2)); // 8
		System.out.println(sumDouble(-1,0)); // -1
		System.out.println(sumDouble(3,3)); // 12
		System.out.println(sumDouble(0,0)); // 0
		System.out.println(sumDouble(0,1)); // 1
		System.out.println(sumDouble(3,4)); // 7
	}

	public static int sumDouble(int a, int b) {
		if(a == b) {
			return (a+b)*2;
		} else {
			return a+b;
		}
	}
}
