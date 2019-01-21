/*
 * Given 2 int arrays, a and b, of any length, return a new array with the
 * first element of each array. If either array is length 0, ignore that
 * array
 */
public class Front11 {
	public int[] front11(int[] a, int[] b) {
		  int[] result = new int[0];
		  
		  if(a.length > 0 && b.length > 0) result = new int[] {a[0], b[0]};
		  else if(a.length > 0) result = new int[] {a[0]};
		  else if(b.length > 0) result = new int[] {b[0]};
  
		  return result;
	}
}
