/*
 * Given an int n, return true if it is within 10 of 100 or 200
 * Note: Math.abs(num) computes the absolute value of a number
 */
public class NearHundred {
	public static void main(String[] args) {
		System.out.println(nearHundred(93)); //true
		System.out.println(nearHundred(90)); //true
		System.out.println(nearHundred(89)); //false
		System.out.println(nearHundred(110)); //false
		System.out.println(nearHundred(111)); //false
		System.out.println(nearHundred(121)); //false
		System.out.println(nearHundred(-101)); //false
		System.out.println(nearHundred(-209)); //false
		System.out.println(nearHundred(190)); //false
		System.out.println(nearHundred(209)); //false
		System.out.println(nearHundred(0)); //false
		System.out.println(nearHundred(5)); //false
		System.out.println(nearHundred(-50)); //false
		System.out.println(nearHundred(191)); //false
		System.out.println(nearHundred(189)); //false
		System.out.println(nearHundred(200)); //false
		System.out.println(nearHundred(210)); //false
		System.out.println(nearHundred(211)); //false
		System.out.println(nearHundred(290)); //false
	}

	public static boolean nearHundred(int n) {
		return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10);
	}
}
