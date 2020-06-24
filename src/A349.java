import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 6/24/2020  11:37 AM
 * Rahul Gogyani
 */
public class A349 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
           int tf=0,f=0,h=0;
            int temp=0;
            boolean flag = true;
            for (int i = 0; i <s.length ; i++) {
                temp = Integer.parseInt(s[i]);
                if(temp==25)tf++;
                else if(temp==50){
                    if(tf>=1){
                        f++;
                        tf--;
                    }else{
                        System.out.println("NO");
                        return;
                    }
                }else if(temp==100){
                    if(f>=1&&tf>=1){
                        f--;
                        tf--;
                    }else if(tf>=3){
                        tf = tf-3;
                    }else{
                        System.out.println("NO");
                        return;
                    }
                }
            }
            System.out.println("YES");

        }catch (Exception e){

        }
    }
}
