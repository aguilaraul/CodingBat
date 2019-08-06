/**
 * We'll say that a positive int divides itself if every digit in the number
 * divides into the number evenly. So for example 128 divides itself since
 * 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide
 * into anything evenly, so no number with a 0 digit divides itself. 
 */
public class DividesSelf {
    public static void main(String[] args) {
        int[] nums = {128, 12, 120, 122, 13, 32, 22, 42, 212, 213, 162};

        for(int n:nums) {
            System.out.println();
            System.out.println(dividesSelf(n));
            System.out.println();
        }

        // System.out.println(dividesSelf(128)); // True
        // System.out.println(dividesSelf(12)); // True
        // System.out.println(dividesSelf(120)); // False
    }

    public static boolean dividesSelf(int n) {
        int digit = n % 10;
        System.out.println("Digit outside: " + digit);

        if(digit == 0) {
            System.out.println("If it's zero: "+ digit);
            return false;
        } else if ((n/digit) % 2 == 0) {
            System.out.println("n inside: " + n);
            System.out.println("Digit's inside: "+digit);
            return dividesSelf(n/10);
        }

        return true;
    }
}