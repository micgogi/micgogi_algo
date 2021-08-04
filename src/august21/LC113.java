package august21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/4/2021  7:58 PM
 * Rahul Gogyani
 */
public class LC113 {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

    }

    static List<List<Integer>> list1 = new ArrayList<>();

    public static void main(String[] args) {
        root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);
        pathSum(root, 22, new ArrayList<>());
        System.out.println(list1);

    }

    public static void pathSum(Node root, int sum, List<Integer> list) {
        if (root == null) return;

        list.add(root.data);
        if (root.left == null && root.right == null && sum == root.data) {
            list1.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;

        } else {
            pathSum(root.left, sum - root.data, list);
            pathSum(root.right, sum - root.data, list);
        }
        list.remove(list.size() - 1);
    }

}

