public class Gcd {
    public static void main(String[] args) {
        int a[] = {2,4};
        int b[] = {16,32,96};
       int l = gcd(b);
       int f = lcm(a);
       int count=0;
        for(int i=f,j=2;i<=l;i=f*j,j++){
            if(l%i==0)count++;
        }
        System.out.println(count);
    }
    public static int gcd(int a[]){
        int result =a[0];
        for(int i=1;i<a.length;i++){
            result = gcd(result,a[i]);
        }
        return result;
}
public static int lcm(int a[]){
        int result = a[0];
        for(int i=1;i<a.length;i++){
            result = lcm(result,a[i]);

        }
        return result;
}

        public static int lcm(int a, int b){
            return a*b/gcd(a,b);
        }
        public static int gcd(int a, int b){
            if(a==0)
                return b;
            return gcd(b%a,a);
        }
}
