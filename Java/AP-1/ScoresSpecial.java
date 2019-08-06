public class ScoresSpecial {
    public static void main(String[] args) {

        int[] a1 = {12, 10, 4};
        int[] b1 = {2, 20, 30};

        int[] a2 = {12, 10, 4};
        int[] b2 = {2, 20, 30};

        int[] a3 = {12, 11, 4};
        int[] b3 = {2, 20, 31};

        System.out.println(scoresSpecial(a1, b1)); // 40
        System.out.println(scoresSpecial(a2, b2)); // 40
        System.out.println(scoresSpecial(a3, b3)); // 20
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return findSpecial(a) + findSpecial(b);
    }

    public static int findSpecial(int[] nums) {
        int largest = 0;

        for(int n:nums) {
            if(n%10 == 0.0) {
                if(largest < n) {
                    largest = n;
                }
            }
        }

        return largest;
    }
}