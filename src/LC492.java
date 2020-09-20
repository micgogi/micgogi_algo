import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/20/2020  11:54 AM
 * Rahul Gogyani
 */
public class LC492 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(constructRectangle(6)));
    }

    public static int[] constructRectangle(int area) {
        int sqroot = (int) Math.sqrt(area);
        while (area % sqroot != 0) sqroot--;
        return new int[]{area / sqroot, sqroot};

    }
}

