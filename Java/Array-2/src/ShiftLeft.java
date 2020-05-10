public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {
        if(nums.length == 0) {
            return nums;
        }

        int temp = nums[0];
        System.arraycopy(nums, 1, nums, 0, nums.length - 1);
        nums[nums.length-1] = temp;
        return nums;
    }
}