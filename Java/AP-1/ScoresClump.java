/*
 * Given an array of scores sorted in increasing order, return true
 * if the array contains 3 adjacent scores that differ from each other
 * by at most 2, such as {3,4,5} or {3,5,5}.
 */
public class ScoresClump {
	public static void main(String[] args) {
		int[] scores1 = {3,4,5}; // true
		int[] scores2 = {3,4,6}; // false
		int[] scores3 = {1,3,5,5}; // true
		int[] scores4 = {2,4,5,6}; // true
		int[] scores5 = {2,4,5,7}; // false
		int[] scores6 = {2,4,4,7}; // true
		int[] scores7 = {3,3,6,7,9}; // false
		int[] scores8 = {3,3,7,7,9}; // true
		int[] scores9 = {4,5,8}; // false

		System.out.println(scoresClump(scores1));
		System.out.println(scoresClump(scores2));
		System.out.println(scoresClump(scores3));
		System.out.println(scoresClump(scores4));
		System.out.println(scoresClump(scores5));
		System.out.println(scoresClump(scores6));
		System.out.println(scoresClump(scores7));
		System.out.println(scoresClump(scores8));
		System.out.println(scoresClump(scores9));
	}

	public static boolean scoresClump(int[] scores) {
		for(int i = 0; i < scores.length-2; i++) {
			int first = scores[i];
			if(Math.abs(scores[i+1] - first) <= 2 && Math.abs(scores[i+2] - first) <= 2) return true;
		}
		return false;
	}
}
