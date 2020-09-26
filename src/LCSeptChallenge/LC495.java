package LCSeptChallenge;

/**
 * @author Micgogi
 * on 9/26/2020  2:41 PM
 * Rahul Gogyani
 */
public class LC495 {
    public static void main(String args[]) {
        int a[] = {1,4};
        int duration = 2;
        int count = duration;
        for (int i = 1; i <a.length ; i++) {
            count+=Math.min(a[i]-a[i-1],duration);
        }
        System.out.println(count);
    }

}

