/*
 * Given 2 int values, return true if either of them
 * is in the range of 10..20 inclusive.
 */
public class In1020 {
	public static void main(String[] agrs) {
		System.out.println(in1020(12,99)); //true
		System.out.println(in1020(21,12)); //true
		System.out.println(in1020(8,99)); //false
		System.out.println(in1020(99,10)); //true
		System.out.println(in1020(20,20)); //true
		System.out.println(in1020(21,21)); //false
		System.out.println(in1020(9,9)); //false
	}

	public static boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
	}		
}
