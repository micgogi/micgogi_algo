/**
 * @author Micgogi
 * on 10/2/2021  11:16 AM
 * Rahul Gogyani
 */
public class LC434 {
    public static void main(String args[]) {
        System.out.println(countSegments("Hello, my name is John"));
    }

    public static int countSegments(String s) {
        return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
    }
}

