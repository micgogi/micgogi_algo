/**
 * @author Micgogi
 * on 11/18/2019  2:17 AM
<<<<<<< HEAD
=======
 * 65 78 75 73 84 65
>>>>>>> changes
 */
public class Test {
    public static void main(String[] args) {
        String s = "011111111111111";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 1;
        int min = Integer.MIN_VALUE;
        boolean found = true;
        while (j < s.length()) {
            if (s.charAt(i) == '0' && s.charAt(j) == '1'&&found) {
                j++;
                found = true;
                if (j - i > min&&found) {
                    min = j - i;

                }
                continue;
            }  else if (s.charAt(i) == '0'&&s.charAt(j)=='0') {
                i = j;
                j = j + 1;
                found = false;
            }else{
                i++;
                j++;
                if (s.charAt(i) == '0' && s.charAt(j) == '1') {

                    found = true;

                }
            }




        }
        System.out.println(min);
    }
}
