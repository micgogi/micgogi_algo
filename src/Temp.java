import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 1/15/2020  3:08 PM
 * Micgogi
 */
public class Temp {
    static  Node root;
    static int l =0;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        root = new Node(5);
        root.left = new Node(2);
        root.right = new  Node(3);
        root.left.left = new Node(7);
        root.left.left.left=  new Node(9);
        root.right.right  = new Node(1);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(6);

        int l = level(root,a,b,0);
        //System.out.println(l);
        int tn = (int)Math.pow(2,l);
        System.out.println(tn-2);
        }catch (Exception e){

        }

    }
    public static int level(Node temp, int a,int b, int level ){

            if(temp==null)return 0;
            if(temp.data ==a )
                return level;

            int r = level(temp.left,a, b,level+1);
            if(r!=0)return r;
             r= level(temp.right,a,b,level+1);

            return r;



    }
}
