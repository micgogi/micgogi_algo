/**
 * @author Micgogi
 * on 10/26/2021  6:44 PM
 * Rahul Gogyani
 */
public class Delete5 {
    public static void main(String args[]) {
        System.out.println(delete5(15354));
        System.out.println(delete5(-15354));
    }

    public static int delete5(int n) {
        boolean isNeg;
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(n));
        if (n > 0) {
            isNeg = false;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '5') {
                    sb.deleteCharAt(i);
                    break;
                }
            }
        } else {
            isNeg = true;
            for (int i = sb.length() - 1; i >= 0; i--) {
                if (sb.charAt(i) == '5') {
                    sb.deleteCharAt(i);
                    break;
                }
            }
        }
        return isNeg ? Integer.parseInt("-" + sb.toString()) : Integer.parseInt(sb.toString());
    }

}

