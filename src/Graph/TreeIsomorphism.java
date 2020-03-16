package Graph;
/*
 *@author Rahul Gogyani

 *
 * 10:19 AM 3/4/2020
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TreeIsomorphism {
    static class TreeNode {
        private int id;
        private TreeNode parent;
        private List<TreeNode> children;

        public TreeNode(int id) {
            this(id, null);
        }

        public TreeNode(int id, TreeNode parent) {
            this.id = id;
            this.parent = parent;
            children = new LinkedList<>();
        }

        public TreeNode parent() {
            return parent;
        }

        public void addChidren(TreeNode... nodes) {
            for (TreeNode node : nodes) {
                children.add(node);
            }
        }

        public int id() {
            return id;
        }

        public List<TreeNode> children() {
            return children;
        }

        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }

    private static TreeNode rootTree(List<List<Integer>> graph, int rootId) {
        TreeNode root = new TreeNode(rootId);
        return buildTree(graph, root);
    }

    private static TreeNode buildTree(List<List<Integer>> graph, TreeNode node) {
        for (int neighbour : graph.get(node.id())) {
            if (node.parent() != null && neighbour == node.parent().id()) {
                continue;
            }
            TreeNode child = new TreeNode(neighbour, node);
            node.addChidren(child);
            buildTree(graph, child);
        }
        return node;
    }

    public static List<List<Integer>> createGraph(int n) {
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        return graph;
    }

    public static void addUndirectedEdge(List<List<Integer>> graph, int from, int to) {
        graph.get(from).add(to);
        graph.get(to).add(from);
    }
    private static List<Integer> findTreeCenter(List<List<Integer>> tree){
        int n = tree.size();
        int[] degree = new int[n];
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            List<Integer> edges = tree.get(i);
            degree[i] = edges.size();
            if(degree[i]<=1){
                leaves.add(i);
                degree[i]=0;
            }
        }
        int processedLeafs = leaves.size();
        while(processedLeafs<n){
            List<Integer> newLeaves = new ArrayList<>();
            for (int node: leaves){
                for (int neighbour: tree.get(node)){
                    if(--degree[neighbour]==1){
                        newLeaves.add(neighbour);
                    }
                }
                degree[node]=0;
            }
            processedLeafs+=newLeaves.size();
            leaves = newLeaves;
        }
        return leaves;
    }
    private static String encode(TreeNode node) {
        if (node == null) {
            return "";
        }
        List<String> labels = new LinkedList<>();
        for (TreeNode child : node.children()) {
            labels.add(encode(child));
        }
        Collections.sort(labels);
        StringBuilder sb = new StringBuilder();
        for (String label : labels) {
            sb.append(label);
        }
        return "(" + sb.toString() + ")";


    }

    private  static boolean treeAreIsomorphic(List<List<Integer>> tree1 , List<List<Integer>> tree2){
        if(tree1.isEmpty()||tree2.isEmpty()){
            throw new IllegalArgumentException("Kya Karte Tum");
        }
        List<Integer> center1 = findTreeCenter(tree1);
        List<Integer> center2 = findTreeCenter(tree2);
        TreeNode rootedTree1 = rootTree(tree1, center1.get(0));
        String tree1Encoding = encode(rootedTree1);
        for (int center: center2){
            TreeNode rootTree2 = rootTree(tree2, center);
            String tree2Encoding = encode(rootTree2);
            if(tree1Encoding.equals(tree2Encoding)){
                return  true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        List<List<Integer>> tree1 = createGraph(5);
        addUndirectedEdge(tree1,2,0);
        addUndirectedEdge(tree1, 3,4);
        addUndirectedEdge(tree1, 2,1);
        addUndirectedEdge(tree1,2,3);
        List<List<Integer>> tree2 = createGraph(5);
        addUndirectedEdge(tree2, 1,0);
        addUndirectedEdge(tree2,2,4);
        addUndirectedEdge(tree2,1,3);
        addUndirectedEdge(tree2,1,2);
        if(!treeAreIsomorphic(tree1,tree2)){
            System.out.println("NOOOOOOOOOOOOOOOOOOO");
        }else{
            System.out.println("YESSSSSSSSSSSSSSSSS");
        }
    }

}
