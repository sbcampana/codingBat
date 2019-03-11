/**
 * Created by Mark on 2/26/2019.
 */


public class Step {
    public static void main(String [] args) {

        // bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
        int[] nums = new int[6];
        nums[0] = 3;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;
        nums[4] = 2;

        System.out.println("BIG STEPS: " + bigHeights(nums, 2, 4));
        System.out.println("2x Big Steps: " + bigHeights(nums, 2, 4) + 4);
    }

    public static int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if ((Math.abs(heights[i + 1] - heights[i])) >= 5) {
                count++;
            }
        }
        return count;
    }
}
