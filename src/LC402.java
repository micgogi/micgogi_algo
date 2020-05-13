/**
 * @author Micgogi
 * on 5/13/2020  2:36 PM
 * Rahul Gogyani
 */
public class LC402 {
    public static void main(String[] args) {
        String s = "1432219";
        int k =3;

        for (int i = 1; i <=k ; i++) {
          s=  removeDigit(s,k);
        }
        System.out.println(s);
    }

    public static String removeDigit(String s, int k){
        int n = s.length();
        int i = n-1;
        for (int j = 0; j <i ; j++) {
            if(s.charAt(j)>s.charAt(j+1)){
                i=j;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j <n ; j++) {
            char digit = s.charAt(j);
            if(sb.length()==0&&digit=='0'||i==j){
                continue;
            }
            sb.append(digit);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
