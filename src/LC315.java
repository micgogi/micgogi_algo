import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 1/10/2021  3:00 PM
 * Rahul Gogyani
 */
public class LC315 {
    static class Node {
        int val;
        int count;
        Node left;
        Node right;

        public Node(int val, int count) {
            this.val = val;
            this.count = count;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String args[]) {
        int[] nums = {5, 2, 6, 1};
        System.out.println(countSmaller(nums));
    }

    public static int add(Node root, int val, int total) {
        if (root == null) {
            root = new Node(val, 0);
            return total;
        }
        if (root.val < val) {
            return root.count + (add(root.right, val, total + 1));
        } else {
            root.count++;
            return add(root.left, val, total);
        }

    }


    public static List<Integer> countSmaller(int[] nums) {


       Integer[] res = new Integer[nums.length];
       int n = nums.length;
       Node root = null;
        for (int i = n-1; i >=0 ; i--) {
            res[i] = add(root,nums[i],0);
        }

        return Arrays.asList(res);
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    count++;
//                }
//            }
//            result.add(count);
//        }
//        return result;
    }
}

