/*
 * Given 2 int arrays, a and b, each length 3, return a new array
 * length 2 containing their middle elements.
 */
public int[] middleWay(int[] a, int[] b) {
  	int[] result = new int[2];

  	result[0] = a[1];
  	result[1] = b[1];

  	return result;
}
