package June21Challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/25/2021  7:47 PM
 * Rahul Gogyani
 */
public class LC684 {
    public static void main(String args[]) {
        LC684 lc684 = new LC684();
        System.out.println(Arrays.toString(lc684.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}})));
    }

    public int[] findRedundantConnection(int[][] edges) {
        DisjointSet disjointSet = new DisjointSet();
        for (int i = 1; i <= edges.length; i++) {
            disjointSet.makeSet(i);
        }
        for (int[] edge : edges) {
            if (!disjointSet.union(edge[0], edge[1])) return edge;
        }
        return new int[]{-1, -1};
    }

}

class DisjointSet {
    Map<Long, Node> map = new HashMap<>();

    class Node {
        long data;
        Node parent;
        int rank;
    }

    public void makeSet(long data) {
        Node node = new Node();
        node.data = data;
        node.parent = node;
        node.rank = 0;
        map.put(data, node);

    }

    public boolean union(long data1, long data2) {
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);
        Node parent1 = findSet(node1);
        Node parent2 = findSet(node2);
        if (parent1.data == parent2.data) {
            return false;
        }
        if (parent1.rank >= parent2.rank) {
            parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
            parent2.parent = parent1;
        } else {
            parent1.parent = parent2;
        }
        return true;

    }

    public long findSet(long data) {
        return findSet(map.get(data)).data;
    }


    public Node findSet(Node node) {
        Node parent = node.parent;
        if (parent == node) {
            return parent;
        }
        node.parent = findSet(node.parent);
        return node.parent;
    }
}