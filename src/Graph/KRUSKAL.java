package Graph;

/**
 * @author Micgogi
 * on 1/25/2020  9:35 PM
 * Micgogi
 */
public class KRUSKAL {
    static int v =5;
    static int[] parent = new int[v];
    static int INF = Integer.MAX_VALUE;
    public static int find(int i){
        while(parent[i]!=i){
            i=parent[i];
        }
        return i;
    }
    public static void union(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a]=b;
    }
    public static void kruskal(int grapgh[][]){
        int mincost =0;
        for (int i = 0; i <v ; i++) {
            parent[i]=i;
        }
        int edgecount=0;
        while(edgecount<v-1){
            int min = INF, a= -1, b=-1;
            for (int i = 0; i <v ; i++) {
                for (int j = 0; j <v ; j++) {
                    if(find(i)!=find(j)&& grapgh[i][j]<min){
                        min = grapgh[i][j];
                        a=i;
                        b=j;
                    }
                }
                
            }
            union(a,b);
            edgecount++;
            mincost+=min;


        }
        System.out.println(mincost);
    }
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        int graph[][] = {
                {INF,2,INF,6,INF},
                {2,INF,3,8,5},
                {INF,3,INF,INF,7},
                {6,8,INF,INF,9},
                {INF,5,7,9,INF}
        };
        kruskal(graph);

        long afteralgoTime = System.currentTimeMillis();
        System.out.println(afteralgoTime);
        System.out.println((afteralgoTime-currentTime));
    }
}
