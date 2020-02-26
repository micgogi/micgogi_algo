/**
 * @author Micgogi
 * on 2/26/2020  10:07 PM
 * Micgogi
 */
public class LC100 {
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
        root1 = null;
       // root1.left = new Node(2);
        //root1.right = new Node(3);
        root2 = null;
        //root2.left = new Node(2);
       // root2.right = new Node(2);
        checkTree(root1,s1);
        checkTree(root2,s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        if(s1.toString().equals(s2.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static StringBuilder s1 = new StringBuilder();
    static StringBuilder s2 = new StringBuilder();
    public static void checkTree(Node root,StringBuilder sb){
        if(root==null){
            sb.append("-");
            return ;
        }
        sb.append(root.data);
        checkTree(root.left,sb);
        checkTree(root.right,sb);

    }
}
