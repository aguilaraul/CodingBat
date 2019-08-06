/**
 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
 * Given an array of positive ints, return a new array of length "count" containing the first
 * endy numbers from the original array. Decompose out a separate isEndy(int n) method to test
 * if a number is endy. The original array will contain at least "count" endy numbers.
 */
public class CopyEndy {

    public static int[] copyEndy(int[] nums, int count) {
        int[] endies = new int[count];

        int j = 0;
        for(int n:nums) {
            if((n >= 0 && n <= 10) || (n >= 90 && n <= 100) ) {
                System.out.println(n);
                if(j < endies.length) {
                    endies[j] = n;
                    j++;
                }
            }
        } 

        return endies;
      }
}