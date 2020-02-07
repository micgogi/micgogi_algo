import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 2/1/2020  9:12 PM
 * Micgogi
 */
public class CC_NUMFACT {
    static boolean prime[] = new boolean[1000001];
    public static void main(String[] args) {
        int[] primes = new int[78498];
        soe();
        for (int i = 0,j=0; i < prime.length; i++) {
            if(prime[i]){
                primes[j]=i;
                j++;
            }
        }
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();
                int count[] = new int [78498];
                String s1[] = s.split(" ");
                for (int i = 0; i <s1.length ; i++) {
                    int n1 = Integer.parseInt(s1[i]);
                    for (int j = 0; j < primes.length&&primes[j]<=n1; j++) {
                        while(n1%primes[j]==0){
                            n1/=primes[j];
                            count[j]++;

                        }
                    }
                }
                int ans =1;
                for (int i = 0; i <count.length ; i++) {
                    ans*=(count[i]+1);
                }
                System.out.println(ans);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
    public static  void soe(){
        int n = prime.length;
        int max = Integer.MAX_VALUE;
        for (int i = 2; i <n ; i++) {
            prime[i]=true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(prime[i])
                for (int j = i*2; j <n; j+=i) {
                    prime[j]=false;
                }
        }

    }
}
