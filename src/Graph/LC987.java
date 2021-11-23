package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/22/2021  9:11 PM
 * Rahul Gogyani
 */
public class LC987 {
    static TreeNode root;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        LC987 lc = new LC987();
        System.out.println(lc.verticalOrder(root));

    }
    Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new HashMap();
    int min = 0;
    int max=0;

    public List<List<Integer>> verticalOrder(TreeNode root){
        helper(root,0,0);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = min; i <=max ; i++) {
            List<Integer> level = new ArrayList<>();
            for (int key:map.get(i).keySet()){
                while (!map.get(i).get(key).isEmpty()){
                    level.add(map.get(i).get(key).poll());
                }
            }
            res.add(level);
        }
        return res;
    }
    public  void helper(TreeNode root, int vlevel,int hlevel){
        if(root!=null){
          min = Math.min(min,vlevel);
          max = Math.max(max,vlevel);
          if(map.get(vlevel)==null){
              map.put(vlevel,new TreeMap<>());
          }
          if(map.get(vlevel).get(hlevel)==null){
              map.get(vlevel).put(hlevel,new PriorityQueue<>());
          }
          map.get(vlevel).get(hlevel).add(root.val);
          helper(root.left,vlevel-1,hlevel+1);
          helper(root.right,vlevel+1,hlevel+1);
        }
    }

}

