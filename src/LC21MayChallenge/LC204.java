package LC21MayChallenge;

/**
 * @author Micgogi
 * on 5/10/2021  3:50 PM
 * Rahul Gogyani
 */
public class LC204 {
    public static void main(String args[]) {
        System.out.println(countPrimes(65));
    }

    public static int countPrimes(int n) {

        boolean prime[] = new boolean[n];
        for (int i = 2; i <n ; i++) {
            prime[i]=true;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(prime[i]){
                for (int j = i*2; j <n ; j+=i) {
                    prime[j]=false;
                }
            }
        }
        int ic=0;
        for (int i = 2; i <n ; i++) {
            if(prime[i])ic++;
        }
        return ic;
    }

}

