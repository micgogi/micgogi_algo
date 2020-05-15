import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 5/14/2020  4:08 PM
 * Rahul Gogyani
 */
public class Escko {
    static class A implements Comparable<A>{
        int value;
        String string;
        public A(int value, String s){
            this.value = value;
            this.string = s;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        @Override
        public int compareTo(A o) {
            return this.value-o.value;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1[]= s.split(",");
        int n = s1.length;
        HashMap<String,A> hm = new HashMap<>();
        HashMap<String,String>hm1 = new HashMap<>();
        int max=0;
        int total=1;
        while(n!=1){
            String s2[] =br.readLine().split("=");
            //System.out.println(Arrays.toString(s2));
            String key = s2[0];
            String s3[]=s2[1].split(" ");
           // System.out.println(Arrays.toString(s3));

            A a = new A(Integer.parseInt(s3[1]),s3[2]);
            hm.put(key,a);
            int val=Integer.parseInt(s3[1]);

            if(val>=max){
                hm1.put(s3[2],key);
                max =val;
            }



            n--;


        }
      //  System.out.println(hm1);
        for(String key:hm1.keySet()){
            total*=hm.get(hm1.get(key)).getValue();
        }
       // System.out.println(total);
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        hm.entrySet().stream().sorted((k1,k2)->k1.getValue().compareTo(k2.getValue()))
                .forEach(k->list.add(k.getKey()));
        Set<String> d= hm.keySet();
       // System.out.println(list);
        String mins="";
        int mul=1;
       for(String s4:s1){
          if(!d.contains(s4)){
              mins=s4;
               mul = hm.get(list.get(list.size()-1)).getValue();

          }
       }
        System.out.println(mins+""+mul);
       sb.append(mul+""+mins);
        int total2=mul;
       for(String key:hm.keySet()){

           if(!hm.get(key).getString().equals(mins)){
              // System.out.println(hm.get(key).getString());
               int val = hm.get(key).getValue();
               System.out.println(val);
               System.out.println(mul);
               hm.get(key).setValue(val*total2);
               total2=val*total2;
           }
           int val = hm.get(key).getValue();
           hm.get(key).setValue(total/val);

          System.out.println(key+" "+hm.get(key).getValue());
          // total=total/val;
       }


        for (int i = 0; i <list.size()-1 ; i++) {
          //  hm1.get();
        }





    }
}
