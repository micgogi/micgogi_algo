/*
 *@author Rahul Gogyani
 *https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * 11:20 AM 2/6/2020
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC429 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {





    }

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ll = new ArrayList<>();
        if(root==null) return ll;

        List<Node> l1 = new ArrayList<>();
        l1.add(root);
        while(!l1.isEmpty()){
            List<Node> nl = new ArrayList();
            List<Integer> data = new ArrayList();
            for(Node n: l1){
                nl.addAll(n.children);
                data.add(n.val);
            }
            l1 = nl;
            ll.add(data);
        }
        return ll;
    }
}
