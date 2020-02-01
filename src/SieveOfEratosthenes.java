/**
 * @author Micgogi
 * on 2/1/2020  9:24 PM
 * Micgogi
 */
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieveOfEras(100);
    }
    public static void sieveOfEras(int n){
        boolean prime[] = new boolean[n+1];
        for (int i = 0; i <n ; i++) {
            prime[i]=true;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++)
        {
            if(prime[i]==true){
                for (int j = i*2; j <=n ; j+=i) {
                    prime[j]=false;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(prime[i]==true){
                System.out.println(i+" ");
            }
        }
    }
}
