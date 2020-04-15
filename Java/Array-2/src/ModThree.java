/**
 * Given an array of ints, return true if the array contains either 3 even or
 * 3 odd values all next to each other
 */
public class ModThree {
    public boolean modThree(int[] nums) {
        int evenCounter = 0;
        int oddCounter = 0;

        for(int n: nums) {
            if(n%2 == 0) {
                evenCounter++;
                if(evenCounter == 3) {
                    return true;
                }
                oddCounter = 0;
            } else {
                oddCounter++;
                if(oddCounter == 3) {
                    return true;
                }
                evenCounter = 0;
            }
        }

        return false;
    }
}