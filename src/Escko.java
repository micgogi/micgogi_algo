
import java.util.*;


public class Escko {
    static class A implements Comparable<A> {
        int value;
        String string;

        public A(int value, String s) {
            this.value = value;
            this.string = s;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        @Override
        public int compareTo(A o) {
            return this.value - o.value;
        }
    }

    static String rec(HashMap<String, String> map, String s, double multi) {
        if (!map.containsKey(s)) return multi + " " + s;
        String val[] = map.get(s).split(" ");
        double val1 = Double.parseDouble(val[0]);

        return rec(map, val[1], multi * val1);
    }


    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String s = s1.nextLine();
        String sArr[] = s.split(",");
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<Double, String> mapChange = new HashMap<>();
        TreeMap<Double, String> mapOrdered = new TreeMap<>();
        String last = "";
        double m = Double.MIN_VALUE;
        for (int i = 0; i < sArr.length - 1; i++) {
            String sKeyValue = s1.nextLine();
            String sArr1[] = sKeyValue.split(" = ");
            map.put(sArr1[0], sArr1[1]);
        }

        for (String key : map.keySet()) {
            String val[] = map.get(key).split(" ");
            String v = rec(map, val[1], Double.parseDouble(val[0]));

            String val1[] = v.split(" ");
            last = val1[1];
            m = Math.max(m, Double.parseDouble(val1[0]));
            mapChange.put(Double.parseDouble(val1[0]), key);
        }

        System.out.println(mapChange);
        for (double key : mapChange.keySet()) {
            String val = mapChange.get(key);
            double changedVal = m / key;
            mapOrdered.put(changedVal, val);
        }
        System.out.println(mapOrdered);

        for (double key : mapOrdered.keySet()) {

            if ((long) key == key) {


                System.out.print((long) key + "" + mapOrdered.get(key) + " = ");
            } else {

                System.out.print(key + "" + mapOrdered.get(key) + " = ");
            }
        }
        if ((long) m == m) {
            System.out.print((long) m + last);
        } else {
            System.out.print((long) m + last);
        }


    }
}
