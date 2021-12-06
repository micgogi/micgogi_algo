import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/6/2021  9:58 AM
 * Rahul Gogyani
 */
public class LC1268 {
    public static void main(String[] args) {
        System.out.println(new LC1268().suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse"));
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        PriorityQueue<String> pq = new PriorityQueue<>(3, Comparator.reverseOrder());
        for (int i = 1; i <=searchWord.length() ; i++) {
            String subStr = searchWord.substring(0,i);
            for (String p:products){
                if(p.startsWith(subStr)){
                    pq.add(p);
                }
                if(pq.size()>3)pq.poll();
            }
            LinkedList<String> list = new LinkedList<>();
            while (!pq.isEmpty()){
                list.addFirst(pq.poll());
            }
            ans.add(list);
        }
        return ans;
    }

}

