/**
 * Given an array of ints, return true if the number of 1s
 * is greater than the number of 4s.
 */
public class More14 {

    public boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for(int n : nums) {
            if(n == 1) {
                ones++;
            }
            if(n == 4) {
                fours++;
            }
        }
        
        return fours < ones;
    }
}