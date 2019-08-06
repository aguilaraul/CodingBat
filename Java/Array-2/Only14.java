/**
 * Given an array of ints, return true if every element
 * is a 1 or a 4.
 */
public class Only14 {
    public boolean only14(int[] nums) {
        for(int n : nums) {
            System.out.println(n);
            if(n != 1 && n != 4) {
                return false;
            }
        }

        return true;
    }
}