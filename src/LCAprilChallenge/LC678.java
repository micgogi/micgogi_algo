package LCAprilChallenge;

/**
 * @author Micgogi
 * on 4/16/2020  2:24 PM
 * Rahul Gogyani
 */
public class LC678 {
    public static void main(String[] args) {
        String s = "()";
        int cmax =0, cmin =0;
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i)=='('){
                cmax++;
                cmin++;
            }else if(s.charAt(i)==')'){
                cmax--;
                cmin--;
            }else if(s.charAt(i)=='*'){
                cmax++;
                cmin--;
            }
            if(cmax<0){
                System.out.println(false);
                break;
            }
            cmin=Math.max(cmin,0);

        }
        if(cmin==0){
            System.out.println(true);

        }

    }
}
