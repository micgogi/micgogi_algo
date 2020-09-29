
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/7/2020  12:42 PM
 * Rahul Gogyani
 */
public class LC987 {

    static TreeNode root;
//    static TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap<>();
//    static PriorityQueue<Integer> pq;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String args[]) {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        LC987 l = new LC987();
        System.out.println(l.verticalTraversal(root));
//
//        System.out.println(verticalTraversal(root));
//        System.out.println(map);
    }

//    public static void verticalLevelOrder(TreeNode root, int level) {
//        if (root == null) return;
//        if (map.containsKey(level)) {
//            map.get(level).add(root.val);
//        } else {
//            pq = new PriorityQueue<>();
//            pq.add(root.val);
//            map.put(level, pq);
//        }
//        verticalLevelOrder(root.left, level - 1);
//        verticalLevelOrder(root.right, level + 1);
//    }
//
//    public static List<List<Integer>> verticalTraversal(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        verticalLevelOrder(root, 0);
//        for (int i : map.keySet()) {
//            PriorityQueue<Integer> pq = map.get(i);
//            List<Integer> list = new ArrayList<>();
//            while (!pq.isEmpty()) {
//                list.add(pq.poll());
//            }
//            res.add(list);
//        }
//        return res;
//    }
    Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new HashMap<>();
    int minX =0, maxX = 0;
    public List<List<Integer>> verticalTraversal(TreeNode root){
        helper(root,0,0);
        List<List<Integer>> vertical = new ArrayList<>();
        for (int i = minX; i <=maxX ; i++) {
            List<Integer> level = new ArrayList<>();
            for(int key: map.get(i).keySet()){
                while (!(map.get(i).get(key)).isEmpty()){
                    level.add(map.get(i).get(key).poll());
                }
            }
            vertical.add(level);
        }
        return vertical;
    }
    public void helper(TreeNode node , int x, int y){
        if(node==null)return;
        minX = Math.min(minX,x);
        maxX = Math.max(maxX, x);
        if(map.get(x)==null){
            map.put(x, new TreeMap<>());
        }
        if(map.get(x).get(y)==null){
            map.get(x).put(y, new PriorityQueue<>());
        }
        map.get(x).get(y).add(node.val);
        helper(node.left,x-1,y+1);
        helper(node.right,x+1,y+1);

    }
}

