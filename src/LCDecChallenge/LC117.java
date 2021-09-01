package LCDecChallenge;

/**
 * @author Micgogi
 * on 7/28/2020  10:38 AM
 * Rahul Gogyani
 */
public class LC117 {
    static Node root;
    static class Node{
        int data;
        Node next;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
      root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.right = new Node(7);
      connect(root);

    }
    public static void connect(Node root){
       Node dummy = new Node(0);
       Node pre = dummy;
       while (root!=null){
           if(root.left!=null){
            pre.next = root.left;
            pre = pre.next;
           }
           if(root.right!=null){
            pre.next = root.right;
            pre = pre.next;
           }
           root = root.next;
           if(root==null){
               pre = dummy;
               root = dummy.next;
               dummy.next = null;
           }
       }

    }



}

