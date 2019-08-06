/*
 * Given an array of scores sorted in increasing order, return true
 * if the array contains 3 adjacent scores that differ from each other
 * by at most 2, such as {3,4,5} or {3,5,5}.
 */
public class ScoresClump {

	public boolean scoresClump(int[] scores) {
		for(int i = 0; i < scores.length-2; i++) {
			int first = scores[i];
			if(Math.abs(scores[i+1] - first) <= 2 && Math.abs(scores[i+2] - first) <= 2) return true;
		}
		return false;
	}
}
