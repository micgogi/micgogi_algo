package LCAprilChallenge;

/**
 * @author Micgogi
 * on 4/20/2020  2:34 PM
 * Rahul Gogyani
 */
public class LC1008 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        int a[] = {8,5,1,7,10,12};
        Node n = construct(a, Integer.MAX_VALUE);

    }
   static int index =0;

    public static Node construct(int a[], int limit){
        if(index==a.length||a[index]>limit){
            return null;

        }

        Node root = new Node(a[index++]);
        root.left= construct(a,root.data);
        root.right = construct(a, limit);
        return root;
    }
}
