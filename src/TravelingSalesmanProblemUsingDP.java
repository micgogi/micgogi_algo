package DP;/*
 *@author Rahul Gogyani
 *Time Complexity: O(2^n*n*n)
 *
 * 11:02 AM 3/20/2020
 */

import java.util.*;

public class TravelingSalesmanProblemUsingDP {
    private static int INFINITY = 100000000;

    private static class Index {
        int currentVertex;
        Set<Integer> vertexSet;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Index index = (Index) o;

            if (currentVertex != index.currentVertex) return false;


            return !(vertexSet != null ? vertexSet.equals(index.vertexSet) : index.vertexSet != null);
        }

        @Override
        public int hashCode() {
            int result = currentVertex;
            result = 31 * result + (vertexSet != null ? vertexSet.hashCode() : 0);
            return result;
        }

        private static Index createIndex(int verrtex, Set<Integer> vertexSet) {
            Index i = new Index();
            i.currentVertex = verrtex;
            i.vertexSet = vertexSet;
            return i;
        }
    }

    private static class SetSizeComparator implements Comparator<Set<Integer>> {
        @Override
        public int compare(Set<Integer> o1, Set<Integer> o2) {
            return o1.size() - o2.size();
        }
    }

    public int minCost(int[][] distance){
        Map<Index, Integer> minCostDp = new HashMap<>();
        Map<Index, Integer> parent = new HashMap<>();

        List<Set<Integer>> allSets = generateCombination(distance.length-1);
        for (Set<Integer> set: allSets){
            for (int currentVertex=1;currentVertex<distance.length;currentVertex++){
                if(set.contains(currentVertex)){
                    continue;
                }
                Index index = Index.createIndex(currentVertex, set);
                int minCost = INFINITY;
                int minPrevVertex = 0;
                Set<Integer> copySet = new HashSet<>(set);
                for (int prevVertex: set){
                    int cost = distance[prevVertex][currentVertex]+getCost(copySet,prevVertex,minCostDp);
                    if(cost<minCost){
                        minCost = cost;
                        minPrevVertex = prevVertex;
                    }
                }
                if(set.size()==0){
                    minCost = distance[0][currentVertex];
                }
                minCostDp.put(index, minCost);
                parent.put(index, minPrevVertex);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <distance.length ; i++) {
            set.add(i);
        }

        int min = Integer.MAX_VALUE;
        int prevVertex = -1;
        Set<Integer> copySet = new HashSet<>(set);
        for (int k : set){
            int cost = distance[k][0]+getCost(copySet, k, minCostDp);
            if(cost<min){
                min = cost;
                prevVertex = k;
            }
        }
       parent.put(Index.createIndex(0,set),prevVertex);
        printTour(parent, distance.length);
    return min;
    }

    private void printTour(Map<Index,Integer> parent, int totalVertices){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <totalVertices ; i++) {
            set.add(i);
        }
        Integer start =- 0;
        Deque<Integer> stack = new LinkedList<>();
        while(true){
            stack.push(start);
            set.remove(start);
            start = parent.get(Index.createIndex(start,set));
            if(stack==null){
                break;
            }
        }
        StringJoiner joiner = new StringJoiner("->");
        stack.forEach(v->joiner.add(String.valueOf(v)));
        System.out.println("\nTSP tour");
        System.out.println(joiner.toString());
    }

    private int getCost(Set<Integer> set, int prevVertex, Map<Index,Integer> minCostDp){
        set.remove(prevVertex);
        Index index = Index.createIndex(prevVertex, set);
        int cost = minCostDp.get(index);
        set.add(prevVertex);
        return cost;
    }
    private List<Set<Integer>> generateCombination(int n){
        int input[] = new int[n];
        for (int i = 0; i <input.length ; i++) {
            input[i]=i+1;
        }
        List<Set<Integer>> allSets = new ArrayList<>();
        int result[] = new int[input.length];

        generateCombination(input,0,0,allSets,result);
        Collections.sort(allSets, new SetSizeComparator());
        return  allSets;
    }

    private void generateCombination(int input[], int start, int pos, List<Set<Integer>> allSets, int result[]){
        if(pos==input.length)return;

        Set<Integer> set = createSet(result, pos);
        allSets.add(set);
        for (int i = start; i <input.length ; i++) {
            result[pos] = input[i];
            generateCombination(input,i+1,pos+1,allSets,result);

        }
    }
    private static  Set<Integer> createSet(int input[], int pos){
        if(pos==0){
            return new HashSet<>();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <pos ; i++) {
            set.add(input[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        int a[][] = {{0,1,15,6},{2,0,7,3},{9,6,0,12},{10,4,8,0}};
        TravelingSalesmanProblemUsingDP travelingSalesmanProblemUsingDP = new TravelingSalesmanProblemUsingDP();
        System.out.println(travelingSalesmanProblemUsingDP.minCost(a));
    }
}
