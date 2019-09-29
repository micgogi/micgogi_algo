/**
 * 
 */

/**
 * @author micgogi
	My4.java
 *
 * 11:25:05 AMSep 29, 2019
 */
public class My4 {
	static Node head;
	static class Node{
		int data;
		Node right;
		Node left;
		public Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}
	public static int length(Node temp) {

		if(temp!=null) {
			
			return Math.max(length(temp.left), length(temp.right));
			
		}
		return 0;
	}
	public static void inorder(Node temp) {
		if(temp!=null) {
			inorder(temp.left);
			System.out.println(temp.data);
			inorder(temp.right);
		}
	}
	public static void main(String args[]) {
		head = new Node(16);
		head.left = new Node(14);
		head.right = new Node(10);
		head.left.left = new Node(8);
		head.left.right = new Node(7);
		head.right.left = new Node(9);
		head.right.right = new Node(3);
		head.left.left.left = new Node(2);
		head.left.left.right = new Node(4);
		head.left.right.left = new Node(1);
		//System.out.println(length(head));		
		inorder(head);
	}

}
