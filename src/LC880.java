

/**
 * @author Micgogi
 * on 12/20/2020  4:13 PM
 * Rahul Gogyani
 */
public class LC880 {
    public static void main(String args[]) {
        String s = "rahul2an45ki32";
        int k = 54;
        System.out.println(decodeAtIndex(s,k));
    }

    public static String decodeAtIndex(String s, int k) {
        long[] lenCount = new long[s.length()];
        lenCount[0] = 1;
        int index = 1;
        while (lenCount[index - 1] < k) {
            if (Character.isAlphabetic(s.charAt(index))) {
                lenCount[index] = lenCount[index - 1] + 1;
            } else {
                lenCount[index] = (s.charAt(index) - '0') * lenCount[index - 1];
            }
            index++;
        }
        index--;
        while (lenCount[index] > k) {
            index--;
            if (lenCount[index] < k) {
                k = (int) (((k - 1) % lenCount[index]) + 1);
            }
        }
        while (Character.isDigit(s.charAt(index))) index--;
       System.out.println(index);
        return ""+s.charAt(index);


    }
}

