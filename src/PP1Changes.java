import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 5/2/2020  4:28 PM
 * Rahul Gogyani
 */
public class PP1Changes {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                String s1[] = br.readLine().split(" ");
                long a[] = new long[n];
                long[] prefixsum = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(s1[i]);

                }
                prefixsum[0]=a[0];
                for (int i = 1; i <n ; i++) {
                    prefixsum[i]=a[i]+prefixsum[i-1];
                }

                long aliceSum = 0;
                long b[] = new long[n];
                long count[] = new long[n+2];
                for (int i = 0; i < k; i++) {
                    String s2[] = br.readLine().split(" ");
                    int x = Integer.parseInt(s2[0]);
                    count[x]++;
                    x = x - 1;
                    int y = Integer.parseInt(s2[1]);
                    count[y+1]--;
                    y = y - 1;
                    if(x==0)aliceSum+=prefixsum[y];
                    else{
                        aliceSum+=prefixsum[y]-prefixsum[x-1];
                    }



                }

                for (int i = 0; i <count.length-1 ; i++) {
                    count[i+1]+=count[i];
                }

                PriorityQueue<Long> pqElements = new PriorityQueue<>((c, d)-> (int) (d-c));
                PriorityQueue<Long> pqIndex =  new PriorityQueue<>((c,d)->(int)(d-c));
                for (int i = 0; i <a.length ; i++) {
                    pqElements.add(a[i]);
                }
                for (int i = 0; i <count.length ; i++) {
                    pqIndex.add(count[i]);
                }

                //System.out.println(Arrays.toString(count));
                long sum=0;
               while (!pqElements.isEmpty()){
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
