/*
 * Given an array of scores, return true if each score is equal
 * or greater than the one before. The array will be length 2 or more.
 */
public class ScoresIncreasing {
	public boolean scoresIncreasing(int[] scores) {
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
