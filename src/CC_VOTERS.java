import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 1/20/2020  9:18 PM
 * Micgogi
 */
public class CC_VOTERS {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String s1[] = s.split(" ");
            int n1 = Integer.parseInt(s1[0]);
            int n2 = Integer.parseInt(s1[1]);
            int n3 = Integer.parseInt(s1[2]);
            int a[] = new int[n1];
            int b [] = new int[n2];
            int c[] = new int[n3];
            for (int i = 0; i <n1 ; i++) {
                a[i]=Integer.parseInt(br.readLine());
            }
            for (int i = 0; i <n2 ; i++) {
                b[i]= Integer.parseInt(br.readLine());
            }
            for (int i = 0; i <n3 ; i++) {
                c[i]= Integer.parseInt(br.readLine());
            }
            HashMap<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i <a.length ; i++) {
                if(!m.containsKey(a[i])){
                    m.put(a[i],1);
                }else {
                    m.put(a[i],m.get(a[i])+1);
                }
            }
            for (int i = 0; i <b.length ; i++) {
                if(!m.containsKey(b[i])){
                    m.put(b[i],1);
                }else {
                    m.put(b[i],m.get(b[i])+1);
                }
            }
            for (int i = 0; i <c.length ; i++) {
                if(!m.containsKey(c[i])){
                    m.put(c[i],1);
                }else {
                    m.put(c[i],m.get(c[i])+1);
                }
            }
            ArrayList<Integer> al = new ArrayList<>();
            for (Integer i : m.keySet()){
                if(m.get(i)>1){
                    al.add(i);
                }
            }
            Collections.sort(al);
            System.out.println(al.size());
            for (int i: al){
                System.out.println(i);
            }

        }catch (Exception e){

        }
    }
}
