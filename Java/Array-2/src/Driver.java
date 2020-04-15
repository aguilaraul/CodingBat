public class Driver {

    public static void main(String[] args) {
        IsEverywhere ie = new IsEverywhere();
        int[] nums = {1, 2, 1, 3, 4};
        int val = 1;

        System.out.println(ie.isEverywhere(nums, val));
    }
}
