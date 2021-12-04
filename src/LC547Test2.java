import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/4/2021  3:10 PM
 * Rahul Gogyani
 */
public class LC547Test2 {
    static Map<Integer, Node> map = new HashMap<>();

    static class Node {
        int val;
        int rank;
        Node parent;
    }

    public void makeSet(int i) {
        Node node = new Node();
        node.rank = 0;
        node.val = i;
        node.parent = node;
        map.put(i, node);
    }

    public Node findParent(Node node) {
        if (node.parent == node) return node.parent;
        node.parent = findParent(node.parent);
        return node.parent;
    }

    public boolean union(int i1, int i2) {
        Node node1 = map.get(i1);
        Node node2 = map.get(i2);
        Node parent1 = findParent(node1);
        Node parent2 = findParent(node2);
        if (parent1 == parent2) return false;
        if (parent1.rank >= parent2.rank) {
            parent1.rank = parent1.rank == parent2.rank ? parent1.rank + 1 : parent1.rank;
            parent2.parent = parent1;
        } else {
            parent1.parent = parent2;
        }
        return true;

    }

    public static void main(String args[]) {
        LC547Test2 lc = new LC547Test2();
        System.out.println(lc.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));

    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        for (int i = 1; i <= n; i++) {
            makeSet(i);
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    union(i + 1, j + 1);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= isConnected.length; i++) {
            set.add(findParent(map.get(i)).val);
        }
        return set.size();
    }


}

