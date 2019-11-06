import java.util.ArrayList;

public class checkBST {
    static Node root;
    static class Node{
        int data;
        Node left; Node right;
        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static ArrayList<Integer> a = new ArrayList();
    public static void inorder(Node temp){
        if(temp!=null){

            inorder(temp.left);
            a.add(temp.data);
            inorder(temp.right);

        }
    }
        static boolean checkBst(Node root){
        inorder(root);
        boolean flag =false;
        for(int i=1;i<a.size();i++){
            if(a.get(i)>a.get(i-1)){
                flag=true;
            }else{
                flag=false;
                break;
            }

        }
        return flag;
        }

    public static void main(String[] args) {
        root = new Node(9);
        root.left = new Node(7);
        root.right = new Node(10);
        root.left.left = new Node(6);
        root.left.right = new Node(8);
        System.out.println(checkBst(root));

    }
}
