/*
 * Given an array of scores, return true if each score is equal
 * or greater than the one before. The array will be length 2 or more.
*/
public class ScoresIncreasing {
	public static void main(String[] args) {
		int[] scores1 = {1,3,4}; //true
		int[] scores2 = {1,3,2}; //false
		int[] scores3 = {1,1,4}; //true
		
		System.out.println(scoresIncreasing(scores1));
		System.out.println(scoresIncreasing(scores2));
		System.out.println(scoresIncreasing(scores3));
	}

	public static boolean scoresIncreasing(int[] scores) {
		int before = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] >= before) {
				before = scores[i];
			} else {
				return false;
			}
		}

		return true;
	}
}
