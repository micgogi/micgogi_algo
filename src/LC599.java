/**
 * @author Micgogi
 * on 3/9/2020  8:18 PM
 * Rahul Gogyani
 */
public class LC599 {

    public static void main(String[] args) {
        String s1[] = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String s2[] ={"KFC", "Shogun", "Burger King"};
        StringBuilder s= new StringBuilder();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <s1.length ; i++) {
            for (int j = 0; j < s2.length; j++) {
            if(s1[i].equals(s2[j])&&min>=(Math.abs(i+j))){
                s.append(s1[i]+"%");
                min=i+j;
            }
            }
        }
        String s3[] = s.toString().split("%");
        System.out.println(s.toString());

    }
}
