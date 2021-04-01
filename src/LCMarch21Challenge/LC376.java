package LCMarch21Challenge;

/**
 * @author Micgogi
 * on 3/18/2021  8:17 PM
 * Rahul Gogyani
 */
public class LC376 {
    public static void main(String args[]) {

    }

    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;

        int down = 1, up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            else if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return Math.max(down, up);
    }


}

