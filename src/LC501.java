/*
 *@author Ragul Gogyani

 *
 * 10:27 AM 3/5/2020
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class LC501 {
    static Node root;
    static class Node{
        int data;
        Node left ;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(2);
        countOccurrence(root);
        int max=0;
        for (int i:map.keySet()){
          if(map.get(i)>max){
              max=map.get(i);
          }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i:map.keySet()){
            if(max==map.get(i))al.add(i);
        }
     int a[] = new int[al.size()];
        int j=0;
        for(int i:al){
            a[j]=i;
            j++;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void countOccurrence(Node root){
        if(root!=null){
           if(!map.containsKey(root.data)){
               map.put(root.data,1);
           }else{
               map.put(root.data, map.get(root.data)+1);
           }
            countOccurrence(root.left);
            countOccurrence(root.right);
        }
    }
}
