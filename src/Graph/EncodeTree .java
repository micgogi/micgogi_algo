/*
 *@author Ragul Gogyani

 *
 * 1:54 PM 3/3/2020
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class EncodeTree {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

    public static void EncodingTree(Node temp, Queue<Integer> q, Queue<Integer> data) {
        if (temp == null) {
            q.add(0);
            return;
        }
        q.add(1);
        data.add(temp.data);
        EncodingTree(temp.left, q, data);
        EncodingTree(temp.right, q, data);
    }

    public static Node decoding(Queue<Integer> q, Queue<Integer> data) {
        if (q.size() < 0) return null;

        Integer b = q.peek();
        q.remove();
        if (b == 1) {
            int key = data.peek();
            data.remove();
            Node root = new Node(key);
            root.left = decoding(q, data);
            root.right = decoding(q, data);
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> data = new LinkedList<>();
        EncodingTree(root, q, data);
        System.out.println(q);
        System.out.println(data);
        Node root = decoding(q, data);

        preorder(root);

    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
