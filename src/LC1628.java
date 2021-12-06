import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  5:28 PM
 * Rahul Gogyani
 */
public class LC1628 {
    /**
     * This is the interface for the expression tree Node.
     * You should not remove it, and you can define some classes to implement it.
     */

    abstract class Node {
        public abstract int evaluate();
        // define your fields here
        Node left;
        Node right;
        int val;
        String op="";
    };
    class TreeNode extends Node {
        TreeNode (int val){
            this.val = val;
        }
        TreeNode (String op){
            this.op = op;
        }
        public int evaluate() {
            if(op.isEmpty()) {
                return val;
            }
            if(op.equals("+")) {
                return left.evaluate() + right.evaluate();
            } else if(op.equals("-")) {
                return left.evaluate() - right.evaluate();
            } else if(op.equals("*")) {
                return left.evaluate() * right.evaluate();
            } else {
                return left.evaluate() / right.evaluate();
            }
        }
    }

    /**
     * This is the TreeBuilder class.
     * You can treat it as the driver code that takes the postinfix input
     * and returns the expression tree represnting it as a Node.
     */

    class TreeBuilder {
        Node buildTree(String[] postfix) {
            Stack<TreeNode> stack = new Stack<>();
            for(String s: postfix){
                if(s.equals("+")||s.equals("-")||s.equals("*")|s.equals("/")){
                    TreeNode right = stack.pop();
                    TreeNode left = stack.pop();
                    TreeNode opNode = new TreeNode(s);
                    opNode.left = left;
                    opNode.right = right;
                    stack.push(opNode);
                }else{
                    stack.push(new TreeNode(Integer.parseInt(s)));
                }
            }
            return stack.pop();
        }
    };


/**
 * Your TreeBuilder object will be instantiated and called as such:
 * TreeBuilder obj = new TreeBuilder();
 * Node expTree = obj.buildTree(postfix);
 * int ans = expTree.evaluate();
 */
}

