
import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/14/2019  9:45 PM
 * Micgogi
 */
public class LC44 {
    public static void main(String[] args) {
        System.out.println(match("aa","*"));
    }
    public static boolean match(String s, String p){
        char[] s1 = s.toCharArray();
        char[] p1 = p.toCharArray();
        int wirteIndex=0;
        boolean isFirst= true;
        for (int i = 0; i < p1.length; i++) {
            if(p1[i]=='*'){
                if(isFirst){
                    p1[wirteIndex++]=p1[i];
                    isFirst = false;
                }

            }else{
                p1[wirteIndex++]=p1[i];
                isFirst= true;

            }
            
        }
        //System.out.println(Arrays.toString(p1));
        boolean[][] T = new boolean[s1.length+1][wirteIndex+1];
        if(wirteIndex>0&&p1[0]=='*'){
            T[0][1]=true;
        }
        T[0][0]=true;
        for (int i = 1; i <T.length ; i++) {
            for (int j = 1; j <T[0].length ; j++) {
                if(p1[j-1]=='?'||s1[i-1]==p1[j-1]){
                    T[i][j]=T[i-1][j-1];
                }else if(p1[j-1]=='*'){
                    T[i][j]= T[i-1][j] || T[i][j-1];
                }
            }
        }
        return T[s1.length][wirteIndex];
    }

}
