import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  2:42 PM
 * Rahul Gogyani
 */
public class LC1135 {

    public static void main(String[] args) {
        System.out.println(new LC1135().minimumCost(3, new int[][]{{1, 2, 5}, {1, 3, 6}, {2, 3, 1}}));
    }

    public int minimumCost(int n, int[][] connections) {
        for (int i = 1; i <= n; i++) {
            makeSet(i);
        }
        Arrays.sort(connections, (a, b) -> a[2] - b[2]);
        int N = n;
        int cost = 0;
        for (int[] connecion : connections) {
            if (union(connecion[0], connecion[1])) {
                cost += connecion[2];
                N--;
            }
        }
        return N == 1 ? cost : -1;
    }

    HashMap<Integer, Node> map = new HashMap<>();

    static class Node {
        int data;
        int rank;
        Node parent;
    }

    public void makeSet(int i) {
        Node node = new Node();
        node.data = i;
        node.rank = 0;
        node.parent = node;
        map.put(i,node);
    }

    public Node findParent(Node node) {
        if (node.parent == node) return node.parent;
        node.parent = findParent(node.parent);
        return node.parent;
    }

    public boolean union(int data1, int data2) {
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);
        Node parent1 = findParent(node1);
        Node parent2 = findParent(node2);
        if (parent1 == parent2) return false;
        if (parent1.rank >= parent2.rank) {
            parent1.rank = parent1.rank == parent2.rank ? parent1.rank + 1 : parent1.rank;
            parent1.parent = parent2;
        } else {
            parent2.parent = parent1;
        }
        return true;
    }
}

