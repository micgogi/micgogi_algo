import java.util.*;

/**
 * @author Micgogi
 * on 11/24/2021  9:52 AM
 * Rahul Gogyani
 */
public class ConnectedCompoenents {

    public static void main(String[] args) {
        ConnectedCompoenents connectedCompoenents = new ConnectedCompoenents();
        for (int i = 0; i <5 ; i++) {
            connectedCompoenents.makeSte(i);
        }
        Set<Long> set= new HashSet();
        connectedCompoenents.union(0,1);
        connectedCompoenents.union(1,2);
        connectedCompoenents.union(3,4);
        for (long i = 0; i <=4 ; i++) {
            set.add(connectedCompoenents.findSet(connectedCompoenents.map.get(i)).data);
        }
        System.out.println(set.size());


    }

    Map<Long, Node> map = new HashMap<>();

    static class Node {
        long rank;
        Node parent;
        long data;
    }

    public void makeSte(long val) {
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

    public boolean union(long data1, long data2) {
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

