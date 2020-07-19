package LCJulyChallenge;

/**
 * @author Micgogi
 * on 7/19/2020  1:01 PM
 * Rahul Gogyani
 */
public class LC67 {
    public static void main(String args[]) {
        String a = "1001100100101100011100110001111101100001";
        String b = "111101100101011010000001001000000";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length() -1;
        int carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0) {
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry==1)sb.append(1);
        return sb.reverse().toString();

    }

}

