/*
 * Given 3 int values, a b c, return their sum. However, if one of the
 * values is the same as another of the values, it does not count towards
 * the sum.
 */
public class LoneSum {
	public int loneSum(int a, int b, int c) {
		boolean ab = a == b;
		boolean ac = a == c;
		boolean bc = b == c;

		if(ab && bc) return 0;
		if(ab) return c;
		if(ac) return b;
		if(bc) return a;

		return a + b + c;
	}
}
