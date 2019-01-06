/*
 * Given two temperatures, return true if one is less than 0
 * and the other is greater than 100
 */
public class IcyHot {
	public static void main(String[] agrs) {
		System.out.println(icyHot(120,-1)); //true
		System.out.println(icyHot(-1,120)); //true
		System.out.println(icyHot(2,120)); //false
		System.out.println(icyHot(-1,100)); //false
		System.out.println(icyHot(-2,-2)); //false
		System.out.println(icyHot(120,120)); //false
	}

	public static boolean icyHot(int temp1, int temp2) {
		return (temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100);
	}
}
