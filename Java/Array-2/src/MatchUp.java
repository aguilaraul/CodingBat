public class MatchUp {

    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;

        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] != nums2[i]) {
                if(Math.abs(nums1[i] - nums2[i]) <= 2) {
                    counter++;
                }
            }
        }

        return counter;
    }
    
}