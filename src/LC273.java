import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/8/2020  9:46 AM
 * Rahul Gogyani
 */
public class LC273 {
    private static final String[] belowTen = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] belowTwenty = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] belowHundred = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String args[]) {
        int num = 657875738;
        System.out.println(numberToWords(num));

    }

    static String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num);
    }

    static String helper(int num) {
        String res = "";
        if (num < 10) res = belowTen[num];
        else if (num < 20) res = belowTwenty[num - 10];
        else if (num < 100) res = belowHundred[num / 10] + " " + helper(num % 10);
        else if (num < 1000) res = helper(num/100) + " Hundred " + helper(num%100);
        else if(num < 1000000) res = helper(num/1000) + " Thousand " + helper(num%1000);
        else if (num < 1000000000) res = helper(num/1000000) + " Million " + helper(num%1000000);
        else res = helper(num/1000000000) + " Billion " + helper(num%1000000000);
        return res.trim();
    }
}

