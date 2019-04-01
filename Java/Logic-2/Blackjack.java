/*
 * Given 2 int values greater than 0, return whichever value is nearest
 * to 21 without going over. Return 0 if they both go over.
 */
public class Blackjack {
	public static void main(String[] args) {
		int a = 19;
		int b = 22;
		
		System.out.println(blackjack(a,b));
	}
	
	public static int blackjack(int a, int b) {
		if(a == 21) return a;
		if(b == 21) return b;
		
		if(a > 21 && b < 21) {
		  return b;
		}
		if(a < 21 && b > 21) {
		  return a;
		}
		
		if(a < 21 && b < 21) {
		  int closer = Math.max(a, b);
		  return closer;
		} 
		
		return 0;
	}
}
