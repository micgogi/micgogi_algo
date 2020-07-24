import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 7/24/2020  4:07 PM
 * Rahul Gogyani
 */
public class LC515 {
    static Node root;
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);
        System.out.println(largestValues(root));

    }
    public static List<Integer> largestValues(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int max = Integer.MIN_VALUE;
            int size =queue.size();
            while (size--!=0){
                Node node = queue.poll();
                max = Math.max(max,node.val);
                if(node.left!=null){
                    queue.add(node.left);

                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(max);
        }
        return list;
    }


}

