/**
 * @author Micgogi
 * on 10/26/2021  6:05 PM
 * Rahul Gogyani
 */
public class StringPalidome {
    //n= 5 k=3 abcba
    //n=4 k=2 abba
    //n=8 k=3 abcccbcc 3 5
    public static void main(String args[]) {
        System.out.println(creatPalin(200,2));
    }

    public static String creatPalin(int n, int k) {
        int rem = n - k * 2;
        String ans = "";
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ans = ans + (char) ('a' + i);
        }
         rev.append(ans).reverse();
        for (int i = 0; i <rem; i++) {
            ans = ans+ans.charAt(ans.length()-1);
        }

        if(rem==-1){
            rev.deleteCharAt(0);
        }
        ans = ans+rev;
        return ans;
    }
}

