import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/16/2020  8:44 AM
 * Rahul Gogyani
 */
public class B1363 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while (t--!=0){
                int suff0=0,suff1=0;
                String s = br.readLine();
                for (char c:s.toCharArray()){
                    if(c=='0')suff0++;
                    if(c=='1')suff1++;
                }
                int ans = Math.min(suff0,suff1);
                int done0=0,done1=0;
                for(char c:s.toCharArray()){
                    if(c=='1'){
                        done1++;
                    }else{
                        done0++;
                    }
                    ans=Math.min(ans,Math.min(done0+suff1-done1,done1+suff0-done0));
                }
                System.out.println(ans);
            }
        }catch (Exception e){

        }
    }
}
