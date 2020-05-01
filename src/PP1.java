import javafx.animation.ScaleTransition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 5/1/2020  2:54 PM
 * Rahul Gogyani
 */
public class PP1 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                String s1[] = br.readLine().split(" ");
                Integer a[] = new Integer[n];
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(s1[i]);
                }
                int aliceSum = 0;
                int b[] = new int[n];
                for (int i = 0; i < k; i++) {
                    String s2[] = br.readLine().split(" ");
                    int x = Integer.parseInt(s2[0]);
                    x = x - 1;
                    int y = Integer.parseInt(s2[1]);
                    y = y - 1;
                    while (x <= y) {
                        aliceSum += a[x];
                        b[x]++;
                        x++;
                    }

                }
                PriorityQueue<Integer> pqElements = new PriorityQueue<>((c, d)->d-c);
                PriorityQueue<Integer> pqIndex =  new PriorityQueue<>((c,d)->d-c);
                for (int i = 0; i <a.length ; i++) {
                    pqElements.add(a[i]);
                }
                for (int i = 0; i <b.length ; i++) {
                    pqIndex.add(b[i]);
                }
                int sum=0;
                while (pqIndex.size()!=0){
                    sum+=pqElements.poll()*pqIndex.poll();
                }
                System.out.println(sum-aliceSum);
//
                //                class MyCount{
//                    List<Integer> index;
//                    int count;
//                    public MyCount(int count, List<Integer> index){
//                        this.index  = index;
//                        this.count = count;
//
//                    }
//                }
//                HashMap<Integer,MyCount> hm = new HashMap<>();
//                System.out.println(Arrays.toString(b));
//                Arrays.sort(b);
//                for (int i = 0; i <b.length ; i++) {
//                    pqElements.add(a[i]);
//                    pqIndex.add(b[i]);
//                  hm.putIfAbsent(b[i],new MyCount(0,new ArrayList<Integer>()));
//                  MyCount myCount = hm.get(b[i]);
//                  myCount.count++;
//                  myCount.index.add(i);
//                  hm.put(b[i],myCount);
//                }
//                int i=0;
//                while (pqIndex.size()!=0){
//                    MyCount myCount = hm.get(pqIndex.poll());
//                    int count = myCount.count;
//                    List<Integer> listIndex=myCount.index;
//                    int size = listIndex.size();
//                    for (int j = 0; j <size ; j++) {
//                        b[listIndex.get(i)]=pqElements.poll();
//                    }
//                }
//                System.out.println(Arrays.toString(b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
