package LCAprilChallenge;

/**
 * @author Micgogi
 * on 4/14/2020  1:26 PM
 * Rahul Gogyani
 */
public class StringShift {
    public static void main(String[] args) {
        String s = "abcdefg";
        StringBuilder sb = new StringBuilder(s);
       int shift[][] ={{1,1},{1,1},{0,2},{1,3}};
        for (int i = 0; i <shift.length ; i++) {
            if(shift[i][0]==0){
               String sl = sb.toString();
               sb.delete(0,sb.length());
               sb.append(leftShitf(sl.toCharArray(),shift[i][1]));

            }
            else {
                String sl = sb.toString();
                sb.delete(0,sb.length());
                sb.append(rightShift(sl.toCharArray(),shift[i][1]));
            }
        }
        System.out.println(sb.toString());
    }

    public static String leftShitf(char c[] , int q){
        while(q!=0) {
            char temp = c[0];
            for (int i = 0; i < c.length - 1; i++) {

            c[i]=c[i+1];

            }
            c[c.length - 1] = temp;
            --q;
        }
        return String.valueOf(c);
    }
    public static String rightShift(char c[], int q){
        while(q!=0) {
             char temp = c[c.length - 1];

            for (int i = c.length - 1; i > 0; i--) {
                c[i] = c[i - 1];

            }
            c[0] = temp;
            --q;
        }
        return String.valueOf(c);
    }
}
