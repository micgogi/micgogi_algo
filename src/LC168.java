/**
 * @author Micgogi
 * on 4/3/2021  12:14 PM
 * Rahul Gogyani
 */
public class LC168 {
    public static void main(String args[]) {

        System.out.println(convertToTitle(18478981));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            sb.append((char) ((columnNumber % 26 == 0 ? 26 : columnNumber % 26)+64));
            columnNumber = (columnNumber % 26 == 0 ? columnNumber / 26-1  : columnNumber / 26);
        }
        return sb.reverse().toString();
    }


}

