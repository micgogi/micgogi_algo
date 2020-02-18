/*
 *@author Rahul Gogyani
 *
 * 11:53 AM 2/18/2020
 */

public class LC109 {
    static ListNode head;
    static public class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    static public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        TreeNode temp = sorted(head);
        printTree(temp);

    }
    public static void printTree(TreeNode temp){
        if(temp==null)return;


        System.out.println(temp.val);
        printTree(temp.left);
        printTree(temp.right);
    }
    public static TreeNode sorted(ListNode head){
        if(head==null)return null;
        if(head.next==null)return new TreeNode(head.val);
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast= fast.next.next;
        }
        prev.next=null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sorted(head);
        root.right = sorted(slow.next);
        return root;
    }
}
