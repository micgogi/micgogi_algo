/*
 *@author Rahul Gogyani
 *
 * 2:40 PM 2/11/2020
 */

public class GG_FIRETREE {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class Data {
        int leftDepth, rightDepth, time;
        boolean contains;

        Data() {
            contains = false;
            leftDepth = 0;
            rightDepth = 0;
            time = -1;
        }

    }
    public static int res=0;
   static void getResult(Node node, Data data, int target){
        if(node ==null){
            return;
        }
        if(node.left==null && node.right ==null){
            if(node.data==target){
                data.contains = true;
                data.time = 0;
            }
            return;
        }
        Data leftData  = new Data();
        getResult(node.left, leftData, target);
        Data rightData = new Data();
        getResult(node.right, rightData, target);
        data.time = leftData.contains?leftData.time+1:-1;
        if(data.time==-1){
            data.time = rightData.contains?rightData.time+1:-1;
        }

        data.contains = leftData.contains||rightData.contains;
        data.leftDepth = (node.left==null)?0:(1+Math.max(leftData.leftDepth,leftData.rightDepth));
        data.rightDepth = (node.right==null)?0:(1+Math.max(rightData.leftDepth,rightData.rightDepth));
        if(data.contains){
            if(leftData.contains){
                res = Math.max(res,data.time+data.rightDepth);
            }
            if(rightData.contains){
                res = Math.max(res, data.time+data.leftDepth);
            }
        }
   }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right.right = new Node(6);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);
        getResult(root,new Data(), 8);
        System.out.println(res);

    }
}
