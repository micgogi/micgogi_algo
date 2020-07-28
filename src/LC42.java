import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/28/2020  9:43 AM
 * Rahul Gogyani
 */
public class LC42 {
    public static void main(String args[]) {

        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));


    }

    public static int trap(int[] height) {
        int total = 0, high1 = 0, high2 = 0;
        for (int l= 0,r=height.length-1;l<r;) {
            if(height[l]<height[r]){
                high1 = Math.max(high1,height[l]);
                total+= high1-height[l++];
            }else{
                high2 = Math.max(high2,height[r]);
                total+= high2-height[r--];
            }

        }
        return total;
    }
}


