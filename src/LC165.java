import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/9/2020  12:38 PM
 * Rahul Gogyani
 */
public class LC165 {
    public static void main(String args[]) {
        String version1 = "1";
        String version2 = "1.1";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
        String s1[] = version1.split("\\.");
        String s2[] = version2.split("\\.");
//        System.out.println(Arrays.toString(s1));
//        System.out.println(Arrays.toString(s2));
        //execution time 4ms
//        int ver1[] = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
//        int ver2[] = Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();
        //execution time 1ms
        int ver1[] = new int[s1.length];
        int ver2[] = new int[s2.length];
        for (int i = 0; i <ver1.length ; i++) {
            ver1[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i <ver2.length ; i++) {
            ver2[i] = Integer.parseInt(s2[i]);
        }
//        System.out.println(Arrays.toString(ver1));
//        System.out.println(Arrays.toString(ver2));
        int i =0;
        int j =0;
        for (; i <Math.min(ver1.length,ver2.length) ; i++,j++) {
            if(ver1[i]>ver2[j]){
                return 1;
            }
            if(ver2[j]>ver1[i]){
                return -1;
            }
        }
        boolean notzero1 = true;
        boolean notzero2 = true;
        int tempi = i;
        int tempj = j;
        while (tempi<ver1.length){
            if(ver1[tempi]!=0){
                notzero1 = false;
                break;
            }
            tempi++;
        }
        while (tempj<ver2.length){
            if(ver2[tempj]!=0){
                notzero2 = false;
                break;
            }
            tempj++;
        }
        if( !notzero1 && i<ver1.length){
            return 1;
        }
        if(!notzero2 && j<ver2.length){
            return -1;
        }
        return 0;

    }

}

