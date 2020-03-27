package DP;/*
 *@author Ragul Gogyani

 *
 * 11:59 AM 3/3/2020
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeCenter {
    int v;
    static LinkedList<Integer>[] adjList;
    public TreeCenter(int v){
        this.v = v;
        adjList = new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            adjList[i]= new LinkedList<>();
        }
    }

    public   void addEdge(int s, int d){
        adjList[s].add(d);
        adjList[d].add(s);
    }

    public static void main(String[] args) {
        TreeCenter tc = new TreeCenter(9);
        tc.addEdge(0,1);
        tc.addEdge(2,1);
        tc.addEdge(2,3);
        tc.addEdge(3,4);
        tc.addEdge(5,3);
        tc.addEdge(2,6);
        tc.addEdge(6,7);
        tc.addEdge(6,8);
        for (int i = 0; i <adjList.length ; i++) {
            System.out.println(adjList[i]);
        }
        System.out.println("Hakuna MAtatat"+findTree(adjList));

    }

    public static List<Integer> findTree(LinkedList<Integer>[] list) {
        int n = list.length;
        int[] degree = new int[n];
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            List<Integer> edges = list[i];
            degree[i]=edges.size();
            if(degree[i]<=1){
                leaves.add(i);
                degree[i]=0;
            }
        }
        int processedLeafs= leaves.size();
        while(processedLeafs<n){
            List<Integer> newLeafs = new ArrayList<>();
            for (int node: leaves){
                for (int neighbour: list[node]){
                    if(--degree[neighbour]==1){
                        newLeafs.add(neighbour);
                    }
                }
                degree[node]=0;
            }
            processedLeafs+=newLeafs.size();
            leaves = newLeafs;
        }
        return leaves;
    }
}
