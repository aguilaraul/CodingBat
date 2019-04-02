/*
 * Given three ints, a b c, return true if one of b or c is "close"
 * (differing from a by at most 1), while the other is "far",
 * differing from both other values by 2 or more.
 */
public class CloseFar {
	public boolean closeFar(int a, int b, int c) {
		if(Math.abs(b-a) <= 1) {
			if(Math.abs(c-a) >= 2 && Math.abs(b-c) >= 2) {
				return true;
			}
		}
		
		if(Math.abs(c-a) <= 1) {
			if(Math.abs(b-a) >= 2 && Math.abs(b-c) >= 2) {
				return true;
			}
		}

		return false;
	}
}
