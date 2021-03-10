package March21Challenge;

/**
 * @author Micgogi
 * on 12/7/2019  3:54 PM
 * Micgogi
 */
public class LC12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3999));
    }

    public static String intToRoman(int num) {
        String[][] romans = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };
        return romans[3][num / 1000 % 10] + romans[2][num / 100 % 10] + romans[1][num / 10 % 10] + romans[0][num % 10];
    }

}