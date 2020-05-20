import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Micgogi
 * on 5/20/2020  3:06 PM
 * Rahul Gogyani
 */
public class B519 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            List<Long> list1 = new ArrayList<>();
            String s[] = br.readLine().split(" ");
            for (int i = 0; i <n ; i++) {
               list1.add(Long.parseLong(s[i]));
            }
            Collections.sort(list1);

            for (int i = 0; i <2 ; i++) {
                String s1[] = br.readLine().split(" ");
                List<Long> list = new ArrayList();
                for(int j=0;j<s1.length;j++){
                    list.add(Long.parseLong(s1[j]));
                }
                Collections.sort(list);
               long element=-1;
               int j=0;
               int index=list1.size()-1;
               for(long e:list){
                   if(list1.get(j)!=e){
                       element=list1.get(j);
                      index = j;
                      break;
                   }
                   j++;
               }


               long ans = element==-1?list1.get(list1.size()-1):element;
                System.out.println(ans);
                list1.remove(index);
               // System.out.println(list1);
            }
        }catch (Exception e){
        e.printStackTrace();
        }
    }
}
