/*
 * Given an array of scores, return true if there are scores of 100
 * next to each other in the array. The array length will be at least 2
 */
public class Scores100 {
	public static void main(String[] args) {
		int[] scores1 = {1, 100, 100}; //true
		int[] scores2 = {1, 100, 99, 100}; //false
		int[] scores3 = {100, 1, 100, 100}; //true
		int[] scores4 = {100, 1, 100, 1}; //false
		int[] scores5 = {1, 2,3,4,5}; //false
		int[] scores6 = {1,2,100,4,5}; //false
		

		System.out.println(scores100(scores1));
		System.out.println(scores100(scores2));
		System.out.println(scores100(scores3));
		System.out.println(scores100(scores4));
		System.out.println(scores100(scores5));
		System.out.println(scores100(scores6));
	}

	public static boolean scores100(int[] scores) {
		int temp = 0;
		for(int i = 0; i < scores.length-1; i++) {
			if(scores[i] == 100 && scores[i+1] == 100) return true;
		}
		return false;
	}
}

