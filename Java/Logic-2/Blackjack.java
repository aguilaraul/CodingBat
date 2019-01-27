/*
 * Given 2 int values greater than 0, return whichever value is nearest
 * to 21 without going over. Return 0 if they both go over.
 */
public class Blackjack {
	public static void main(String[] args) {
		int a = 19;
		int b = 21;

		int closer = Math.min(Math.abs(a-21), Math.abs(b-21));

		System.out.println(blackjack(a,b));
	}

	public static int blackjack(int a, int b) {
		int a21 = a-21;
		int b21 = b-21;

		if(a21 == 0) return a;
		if(b21 == 0) return b;
		
		if(b21 > a21 && !(b21 > 0)) return b;
		return a;
	}
}
