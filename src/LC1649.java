

/**
 * @author Micgogi
 * on 1/10/2021  2:05 PM
 * Rahul Gogyani
 */
public class LC1649 {
    public static void main(String args[]) {
        int[] nums = {1, 5, 6, 2};
        LC1649 lc1649 = new LC1649();
        System.out.println(lc1649.ceateSortedArray(nums));
    }

    public int ceateSortedArray(int[] nums) {
        int mod = 1000000007;
        long res = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        FenwickTree fe = new FenwickTree();
        fe.createTree(nums);
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int less = fe.sumRange(0, cur - 1);
            int large = fe.sumRange(cur + 1, max + 1);

            res += Math.min(less, large);
            res %= mod;
            fe.update(cur, 1);
        }

        return (int) res;
    }

    class FenwickTree {
        int[] binaryIndexedTree;

        public void update(int val, int inndex) {
            while (inndex < binaryIndexedTree.length) {
                binaryIndexedTree[inndex] += val;
                inndex = getNext(inndex);
            }
        }

        public int sumRange(int i, int j) {
            return getSum(j + 1) - getSum(i);
        }

        public int getSum(int index) {
            index = index + 1;
            int sum = 0;
            while (index > 0) {
                sum += binaryIndexedTree[index];
                index = getParent(index);
            }
            return sum;
        }

        public int[] createTree(int[] input) {
            binaryIndexedTree = new int[input.length + 1];
            for (int i = 1; i <= input.length; i++) {
                update(input[i - 1], i);
            }
            return binaryIndexedTree;
        }

        public int getParent(int index) {
            return index - (index & -index);
        }

        public int getNext(int index) {
            return index + (index & -index);
        }

    }

}

