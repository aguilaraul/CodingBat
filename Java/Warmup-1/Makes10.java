/*
 * Given 2 ints, a and b, return true if one of them is 10
 * or if their sum is 10.
 */
public class Makes10 {
	public static void main(String[] args) {
		System.out.println(makes10(9,10)); //true
		System.out.println(makes10(9,9)); //false
		System.out.println(makes10(1,9)); //true
		System.out.println(makes10(10,1)); //true
		System.out.println(makes10(10,10)); //true
		System.out.println(makes10(8,2)); //true
		System.out.println(makes10(8,3)); //false
		System.out.println(makes10(10,42)); //true
		System.out.println(makes10(12,-2)); //true
	}

	public static boolean makes10(int a, int b) {
		return ( a == 10 || b == 10 || a+b == 10);
	}
}
