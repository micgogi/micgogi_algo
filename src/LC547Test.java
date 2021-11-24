import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/24/2021  11:29 AM
 * Rahul Gogyani
 */
public class LC547Test {
    public static void main(String[] args) {
        System.out.println(new LC547Test().findCurcleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    public int findCurcleNum(int[][] isConnected) {
        for (int i = 0; i <isConnected.length ; i++) {
            makeSte(i+1);
        }
        for (int i = 0; i <isConnected.length ; i++) {
            for (int j = 0; j <isConnected[i].length ; j++) {
                if(isConnected[i][j]==1){
                    union(i+1,j+1);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <=isConnected.length ; i++) {
            set.add(findSet(map.get(i)).data);
        }

        return set.size();

    }
    Map<Integer, Node> map = new HashMap<>();

    static class Node {
        int rank;
        Node parent;
        int data;
    }

    public void makeSte(int val) {
        Node node = new Node();
        node.data = val;
        node.rank = 0;
        node.parent = node;
        map.put(val, node);
    }

    public Node findSet(Node node) {
        if (node.parent == node) return node.parent;
        node.parent = findSet(node.parent);
        return node.parent;
    }

    public boolean union(int data1, int data2) {
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);
        Node parent1 = findSet(node1);
        Node parent2 = findSet(node2);
        if (parent1 == parent2) return false;
        if (parent1.rank >= parent2.rank) {
            parent1.rank = parent1.rank == parent2.rank ? parent1.rank + 1 : parent1.rank;
            parent2.parent = parent1;
        } else {
            parent1.parent = parent2;
        }
        return true;
    }
}

