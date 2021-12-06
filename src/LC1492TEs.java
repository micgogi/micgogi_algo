import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  12:48 PM
 * Rahul Gogyani
 */
public class LC1492TEs {
    public int kthFactor(int n, int k) {
        Queue<Integer> q = new PriorityQueue<>((a, b)->Integer.compare(b,a));
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                q.add(i);
                if(q.size()>k)q.poll();
                if(i!=n/i){
                    q.add(n/i);
                    if(q.size()>k)q.poll();
                }

            }
        }
        return q.size()==k?q.poll():-1;
    }
    public static void main(String[] args) {

    }
}

