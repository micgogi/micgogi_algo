import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 3/27/2020  3:39 PM
 * Rahul Gogyani
 */
public class LC264 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            int i2=0,i3=0,i5=0;
            int nextMul2=2;
            int nextMul3 = 3;
            int nextMul5 =5;
            int nextUglyNo =1;
            a[0]=1;


            for (int i = 1; i <n ; i++) {
                nextUglyNo= Math.min(nextMul2, Math.min(nextMul3,nextMul5));
                a[i]=nextUglyNo;
                if(nextUglyNo ==nextMul2){
                    i2=i2+1;
                    nextMul2 = a[i2]*2;
                }
                if(nextUglyNo==nextMul3){
                    i3=i3+1;
                    nextMul3 = a[i3]*3;
                }
                if(nextUglyNo==nextMul5){
                    i5=i5+1;
                    nextMul5 = a[i5]*5;
                }
            }

            System.out.println(nextUglyNo);
        }catch (Exception e){

        }
    }
}
