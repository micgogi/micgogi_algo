/**
 * @author Micgogi
 * on 2/26/2020  10:32 PM
 * Micgogi
 */
public class LC872 {
    static Node root1;
    static Node root2;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        root1 = new Node(3);
        root1.left = new Node(5);
        root1.right = new Node(1);
        root1.left.left = new Node(6);
        root1.left.right = new Node(2);
        root1.left.right.left = new Node(7);
        root1.left.right.right = new Node(4);
        root1.right.left = new Node(9);
        root1.right.right = new Node(8);
        root2 = new Node(3);
        root2.left = new Node(5);
        root2.right = new Node(1);
       // root2.left.left = new Node(6);
        root2.left.right = new Node(2);
        root2.left.right.left = new Node(7);
        //root2.left.right.right = new Node(4);
        root2.right.left = new Node(9);
        root2.right.right = new Node(8);
        checkTree(root1,s1);
        checkTree(root2,s2);
        if(s1.toString().equals(s2.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("false");
        }
    }
    static StringBuilder s1 = new StringBuilder();
    static StringBuilder s2 = new StringBuilder();
    public static void checkTree(Node root,StringBuilder sb){
        if(root==null)return;
        if(root.left==null&&root.right==null){
           sb.append(root.data);
        }
        checkTree(root.left,sb);
        checkTree(root.right,sb);

    }
}
