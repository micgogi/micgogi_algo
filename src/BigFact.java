import java.math.BigInteger;
import java.util.Scanner;

public class BigFact {

    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static BigInteger fact(int n){
        BigInteger bigInteger = new BigInteger("1");
        for(int i=2;i<=n;i++){
            bigInteger= bigInteger.multiply(BigInteger.valueOf(i));
        }

        return bigInteger;


    }
}
