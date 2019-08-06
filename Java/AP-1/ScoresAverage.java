/*
 * Given an array of scores, compute the int average of the first half and
 * the second half, and return whichever is larger. We'll say that the second
 * half begins at index length/2. The array length will be at least 2.
 */
public class ScoresAverage {

	public int scoresAverage(int[] scores) {
		int half = scores.length/2;

		int[] firstHalf = new int[half];
		for(int i = 0; i < half; i++) {
			firstHalf[i] = scores[i];
		}
		int[] secondHalf = new int[half];
		int j = 0;
		for(int i = half; i < scores.length; i++) {
			secondHalf[j] = scores[i];
			j++;
		}

		int larger = average(firstHalf);
		if(average(secondHalf) > larger) {
			larger = average(secondHalf);
		}
		return larger;
	}

	public static int average(int[] scores) {
		int length = scores.length;
		int sum = 0;

		for(int number : scores) {
			sum += number;
		}

		return sum/length;
	}
}
