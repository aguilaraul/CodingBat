/*
 * Given three int values, a b c, return the largest.
 */
public class IntMax {
	public static void main(String[] args) {
		System.out.println(intMax(1,2,3)); // 3
		System.out.println(intMax(1,3,2)); // 3
		System.out.println(intMax(3,2,1)); // 3
		System.out.println(intMax(9,3,3)); // 9
		System.out.println(intMax(3,9,3)); // 9
		System.out.println(intMax(3,3,9)); // 9
		System.out.println(intMax(8,2,3)); // 8
		System.out.println(intMax(-3,-1,-2)); // -1
		System.out.println(intMax(6,2,5)); // 6
		System.out.println(intMax(5,6,2)); // 6
		System.out.println(intMax(5,2,6)); // 6
	}

	public static int intMax(int a, int b, int c) {
		int[] array = {a, b, c};
		int largest = array[0];
		for(int i = 1; i < 3; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
}
