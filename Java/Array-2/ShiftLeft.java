public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 3};

        System.out.println("Before shift:");
        for(int i:nums) {
            System.out.println(i);
        }
        System.out.println();

        shiftLeft(nums);

        System.out.println("After shift:");
        for(int i:nums) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static int[] shiftLeft(int[] nums) {
        int pos = nums.length-1;
        int temp = nums[pos-1];
        System.out.println();
            System.out.println("Pos: " + pos);
            System.out.println("Temp: " + temp);
            System.out.println();
        do {
            nums[pos-1] = nums[pos];
            if(pos == 0) {
                temp = nums[nums.length-1];
                nums[nums.length-1] = nums[pos];
            }
            pos--;
            if(pos != 0) {
                temp = nums[pos-1];
            }

            System.out.println();
            System.out.println("Pos: " + pos);
            System.out.println("nums[pos]: " + nums[pos]);
            System.out.println("Temp: " + temp);
            System.out.println();
        } while (pos > 0);

        return nums;
    }
}