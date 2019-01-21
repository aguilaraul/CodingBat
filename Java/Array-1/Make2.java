/*
 * Given 2 int arrays, a and b, return a new array length 2 containing, as
 * much as will fit, the elements from a followed by the elements from b.
 * The arrays may be any length, including 0, but there will be 2 or more
 * elements avaliable between the 2 arrays.
 */
public class Make2 {
	public static void main(String[] args) {
		int[] a = {};
		int[] b = {1,2,3};

		for(int number:make2(a,b))
			System.out.println(number);
	}

	public static int[] make2(int[] a, int[] b) {
		int[] result;
		
		if(a.length >= 2) {
			return result = new int[] {a[0], a[1]};
		} else {
			result = new int[a.length];
			for(int i = 0; i < result.length; i++ ) {
				result[i] = a[i];
			}
		}
		
		if(result.length == 0 && b.length >= 2) {
			return result = new int[] {b[0], b[1]};
		}
		
		if(result.length == 1) {
			int temp = result[0];
			result = new int[2];
			result[0] = temp;
			result[1] = b[0];
		}
		
		return result;
	}
}
