/*
 * Given 2 int values, return true if they are both in the
 * range of 30..40 inclusive, or they are both in the range
 * of 40..50 inclusive.
 */
public class In3050 {
	public static void main(String[] args) {
		System.out.println(in3050(30,31)); // true
		System.out.println(in3050(30,41)); // false
		System.out.println(in3050(40,50)); // true
		System.out.println(in3050(40,51)); // false
		System.out.println(in3050(39,50)); // false
		System.out.println(in3050(50,39)); // false
		System.out.println(in3050(40,39)); // true
		System.out.println(in3050(49,48)); // true
		System.out.println(in3050(50,40)); // true
		System.out.println(in3050(50,51)); // false
		System.out.println(in3050(35,36)); // true
		System.out.println(in3050(35,45)); // false
	}

	public static boolean in3050(int a, int b) {
		if ( a >= 30 && a <= 40 && b >= 30 && b <= 40) {
			return true;
		}
		if ( a >= 40 && a <= 50 && b >= 40 && b <= 50) {
			return true;
		}
		return false;
	}
}
