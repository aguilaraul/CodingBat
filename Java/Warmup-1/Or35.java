/*
 * Return true if the given non-negative number is a multiple of 3
 * or a multiple of 5. Use the % "mod" operator
 */
public class Or35 {
	public static void main(String[] args) {
		System.out.println(or35(3)); //true
		System.out.println(or35(10)); //true
		System.out.println(or35(8)); //false
		System.out.println(or35(15)); //true
		System.out.println(or35(5)); //true
		System.out.println(or35(9)); //true
		System.out.println(or35(4)); //false
		System.out.println(or35(7)); //false
		System.out.println(or35(6)); //true
		System.out.println(or35(17)); //false
		System.out.println(or35(18)); //true
		System.out.println(or35(29)); //false
		System.out.println(or35(20)); //true
		System.out.println(or35(21)); //true
		System.out.println(or35(22)); //false
		System.out.println(or35(45)); //true
		System.out.println(or35(99)); //true
		System.out.println(or35(100)); //true
		System.out.println(or35(101)); //false
		System.out.println(or35(121)); //false
		System.out.println(or35(122)); //false
		System.out.println(or35(123)); //true
	}

	public static boolean or35(int n) {
		return (n%3 == 0) || (n%5 == 0);
	}
}
