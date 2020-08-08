import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/8/2020  12:38 PM
 * Rahul Gogyani
 */
public class LC437 {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String args[]) {
        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(-3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);
        root.right.right = new Node(11);
        map.put(0, 1);
        System.out.println(pathSum(root, 8));
    }

    public static int pathSum(Node root, int sum) {

        return helper(root, 0, sum);

    }

    public static int helper(Node root, int curSum, int sum) {
        if (root == null) return 0;
        curSum = curSum + root.data;
        int res = map.getOrDefault(curSum - sum, 0);
        map.put(curSum, map.getOrDefault(curSum,0) + 1);
        int left = helper(root.left, curSum, sum);
        int right = helper(root.right, curSum, sum);
        res+=left+right;
        map.put(curSum, map.get(curSum) - 1);
        return res;

    }


}

