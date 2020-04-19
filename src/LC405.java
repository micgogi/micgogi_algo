/**
 * @author Micgogi
 * on 4/19/2020  12:32 PM
 * Rahul Gogyani
 */
public class LC405 {
    public static void main(String[] args) {


        System.out.println(toHex(16));
          }


    public static String toHex(int n) {
        if(n == 0) return "0";
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder s = new StringBuilder();
        while(n!=0) {

            s.append(hex[n&15]);
            n = n >>> 4;
        }
        return s.reverse().toString();
    }
}
