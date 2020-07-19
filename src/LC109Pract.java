import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/19/2020  2:46 PM
 * Rahul Gogyani
 */
public class LC109Pract {
    static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }
    public static void main(String args[]) {
        head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        TreeNode root = sortedlistTOBST(head);
        printPreorder(root);

    }
    public static TreeNode sortedlistTOBST(ListNode head){
        if(head==null)return null;
        if(head.next==null)return new TreeNode(head.val);
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while (fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedlistTOBST(head);
        root.right = sortedlistTOBST(slow.next);
        return root;
    }
    public static void printPreorder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
           printPreorder(root.left);
           printPreorder(root.right);


        }
    }


}

