package June21Challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 6/18/2021  7:46 PM
 * Rahul Gogyani
 */
public class LC307 {
    public static void main(String args[]) {
        LC307 lc307 = new LC307(new int[]{7, 2, 7, 2, 0});
        lc307.update(4, 6);
        lc307.update(0, 2);
        lc307.update(0, 9);
        System.out.println(lc307.sumRange(4, 4));
        lc307.update(3, 8);
        System.out.println(lc307.sumRange(0, 4));
    }

    int[] tree;
    int n;

    public LC307(int[] nums) {
        if (nums.length > 0) {
            n = nums.length;
            tree = new int[n * 2];
            buildTree(nums);
        }
    }

    public void buildTree(int[] nums) {
        for (int i = n, j = 0; i < 2 * n; i++, j++) {
            tree[i] = nums[j];
        }
        for (int i = n - 1; i > 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }
    }

    public void update(int index, int val) {
        index += n;
        tree[index] = val;
        while (index > 0) {
            int left = index;
            int right = index;
            if (index % 2 == 0) {
                right = index + 1;
            } else {
                left = index - 1;
            }
            tree[index / 2] = tree[left] + tree[right];
            index /= 2;
        }
    }

    public int sumRange(int left, int right) {
        left += n;
        right += n;
        int sum = 0;
        while (left <= right) {
            if ((left % 2) == 1) {
                sum += tree[left];
                left++;
            }
            if ((right % 2) == 0) {
                sum += tree[right];
                right--;
            }
            left /= 2;
            right /= 2;
        }
        return sum;
    }
}

