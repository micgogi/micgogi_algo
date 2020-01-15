import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class VerticalLevelOrder {
    static TreeMap<Integer, ArrayList> tm = new TreeMap<>();
    static ArrayList<Integer> al;
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void vertical(Node temp, int level){
       if(temp==null)return;
       if(tm.containsKey(level)){
           ArrayList x = tm.get(level);
           x.add(temp.data);
           tm.put(level,x);
       }else{
           al = new ArrayList<>();
           al.add(temp.data);
           tm.put(level,al);
       }
        vertical(temp.right,level+1);
       vertical(temp.left,level-1);



    }
    static int difff(int a, int b){
        Set<Integer> se = tm.keySet();
        int fk=0;
        int sk =0;
        for (int i:se){
            ArrayList<Integer> al = tm.get(i);
            for (int j = 0; j <al.size() ; j++) {
                if(al.get(j)==a){
                    fk=i;
                }
                if(al.get(j)==b){
                    sk =i;
                }
            }

        }
        System.out.println(sk+" "+fk);
        return sk-fk-2;
    }
    static void printTree(Node temp){
        Set<Integer> se = tm.keySet();
        for(int i :se){
            System.out.print(tm.get(i));
        }
    }
    public static void main(String[] args) {
//        root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        root = new Node(1);
//        root.right = new Node(14);
//        root.right.left = new Node(3);
//        root.right.right = new Node(15);
//        root.right.left.left = new Node(2);
//        root.right.left.right = new Node(7);
//        root.right.left.right.left = new Node(4);
//        root.right.left.right.right = new Node(13);
//        root.right.left.right.left.right = new Node(5);
//        root.right.left.right.left.right.right = new Node(6);
//        root.right.left.right.right.left = new Node(10);
//        root.right.left.right.right.left.right = new Node(11);
//        root.right.left.right.right.left.right.right = new Node(12);
        root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.left.left = new Node(9);
        root.right.right = new Node(1);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(6);
        vertical(root,0);

        //printTree(root);
        System.out.println(difff(2,3));

    }
}
