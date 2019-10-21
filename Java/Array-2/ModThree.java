/**
 * Given an array of ints, return true if the array contains either 3 even or
 * 3 odd values all next to each other
 */
public class ModThree {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 5}; // true
        int[] b = {2, 1, 2, 5}; // false
        int[] c = {2, 4, 2, 5}; // true
        int[] d = {1, 2, 1, 2, 1}; // flase

        System.out.println(modThree(a));
        System.out.println(modThree(b));
        System.out.println(modThree(c));
        System.out.println(modThree(d));
    }

    public static boolean modThree(int[] nums) {
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