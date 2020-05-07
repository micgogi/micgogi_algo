import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/7/2020  11:02 AM
 * Rahul Gogyani
 */
public class A996 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int n1=0,n5=0,n10=0,n20=0,n100=0;
            if(n>=100){
                n100=n/100;
                n-=n100*100;
            }
            if(n>=20){
                n20=n/20;
                n-=n20*20;
            }
            if(n>=10){
                n10=n/10;
                n-=n10*10;
            }
            if(n>=5){
                n5=n/5;
                n-=n5*5;
            }
            if(n>=1){
                n1=n;
            }

            System.out.println(n1+n5+n10+n20+n100);
        }catch (Exception e){

        }
    }
}
