import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/7/2021  10:14 AM
 * Rahul Gogyani
 */
public class LC273Test {
    private static final String[] LESS_THAN_20 ={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"","Thousand","Million","Billion"};

    public static void main(String args[]) {

    }
    public String numbertToWords(int num){
        if(num==0)return "Zero";
        int i =0;
        //1234567890
        String words="";
        while (num!=0){
            if(num%1000!=0){
                words =helper(num%1000)+THOUSANDS[i]+" "+words;
            }
            num=num/1000;
            i++;
        }
        return words;
    }
    public String helper(int num){
        if(num==0)return "";
        if(num<20)return LESS_THAN_20[num]+" ";
        if(num<100)return TENS[num/10]+" "+helper(num%10);
        return LESS_THAN_20[num/100]+" Hundred "+helper(num%100);
    }


}

