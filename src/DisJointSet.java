import java.util.HashMap;

/**
 * @author Micgogi
 * on 11/22/2021  10:14 AM
 * Rahul Gogyani
 */
public class DisJointSet {
    HashMap<Long, Node> map = new HashMap<>();

    static class Node {
        long data;
        long rank;
        Node parent;
    }

    public void makeSet(long data) {
        Node node = new Node();
        node.data = data;
        node.rank = 0;
        node.parent = node;
        map.put(data, node);
    }

    public long findSet(long data) {
        return findSet(map.get(data)).data;
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

    public Node findSet(Node node) {
        Node parent = node.parent;
        if (parent == node) return parent;
        node.parent = findSet(node.parent);
        return node.parent;

    }

    public static void main(String[] args) {
        DisJointSet disJointSet = new DisJointSet();
        disJointSet.makeSet(1);
        disJointSet.makeSet(2);
        System.out.println(disJointSet.findSet(1));
        System.out.println(disJointSet.findSet(2));
        System.out.println(disJointSet.union(1,2));
        System.out.println(disJointSet.findSet(1));
        System.out.println(disJointSet.findSet(2));
    }

}

