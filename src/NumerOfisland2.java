import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Micgogi
 * on 11/22/2021  6:19 PM
 * Rahul Gogyani
 */
public class NumerOfisland2 {

    public static void main(String[] args) {
        int[][] positions = {{0,0},{0,1},{1,2},{2,1}};
        NumerOfisland2 numerOfisland2 = new NumerOfisland2();
        System.out.println(numerOfisland2.numOfIslands2(3,3,positions));
    }


    static class Node{
        long data;
        long rank;
        Node parent;

    }
 HashMap<Long,Node> map = new HashMap<>();
    public void makeSet(long data){
        Node node = new Node();
        node.data = data;
        node.rank =1;
        node.parent = node;
        map.put(data,node);
    }
    public Node findSet(Node node){
        Node parent = node.parent;
        if(parent==node)return parent;
        node.parent = findSet(node.parent);
        return node.parent;

    }
    public boolean union(long data1, long data2){
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);
        Node parent1 = findSet(node1);
        Node parent2 = findSet(node2);
        if(parent1==parent2)return false;
        if(parent1.rank>=parent2.rank){
            parent1.rank=parent1.rank == parent2.rank?parent1.rank+1:parent2.rank;
            parent2.parent = parent1;
        }else{
            parent1.parent = parent2;
        }
        return true;
    }

    public List<Integer> numOfIslands2(int m,int n,int[][] positions){
        boolean[] island = new boolean[m*n];
        int count =0;
        List<Integer> res = new ArrayList<>();
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                makeSet(i*n+j);
            }
        }
        for (int[] p:positions){
            int index = p[0]*n+p[1];
            if(island[index]){
                res.add(count);
                continue;
            }
           island[index]= true;
            count++;
            for(int[] d:dirs){
                int nextX = p[0]+d[0];
                int nextY = p[1]+d[1];
                int newIndex = nextX*n+nextY;
                if(nextX<0||nextX>=m||nextY<0||nextY>=n||!island[newIndex])continue;
                union(index,newIndex);
                count--;

            }
            res.add(count);
        }
        return res;
    }
}

