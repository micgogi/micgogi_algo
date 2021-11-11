import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/11/2021  8:25 PM
 * Rahul Gogyani
 */
public class LC1465 {
    public static void main(String args[]) {
        System.out.println(maxArea(1000000000,1000000000,new int[]{2},new int[]{2}));
    }

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int mod=1000000007;
        int maxhz =Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        int maxvr = Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
        for (int i = 1; i <horizontalCuts.length ; i++) {
            maxhz =Math.max(maxhz,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        for (int i = 1; i < verticalCuts.length; i++) {
                maxvr = Math.max(maxvr,verticalCuts[i]-verticalCuts[i-1]);
        }
        System.out.println(maxhz);
        System.out.println(maxvr);
        return (int)  ((long)maxhz*maxvr%mod);
    }
}

