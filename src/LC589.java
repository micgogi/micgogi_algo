/*
 *@author Rahul Gogyani
 *https://leetcode.com/problems/n-ary-tree-preorder-traversal
 * 11:03 AM 2/6/2020
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC589
{
    static Node root;
    static class Node{
        public int val;
        public List<Node> children;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, List<Node> children){
            this.val = val;
            this.children = children;
        }
        }
    public static void main(String[] args) {
List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            result.add(node.val);
            for (int i = node.children.size()-1; i >=0 ; i--) {
                stack.add(node.children.get(i));
                
            }
        }
    }

}
