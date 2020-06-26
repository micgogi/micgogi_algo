package LCJuneChallenge;

/**
 * @author Micgogi
 * on 4/16/2020  3:47 PM
 * Rahul Gogyani
 */
public class LC129 {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(0);
        root.left.left = new Node(5);
        root.left.right= new Node(1);
        System.out.println(sum(root,0));
    }


    public static int sum(Node root,int data ){
        if(root==null)return 0;
        data = data*10+root.data;
        if(root.left==null&&root.right==null){
            return data;
        }
       return sum(root.left,data)+sum(root.right,data);


    }
}
