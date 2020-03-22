/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Matrix {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s2 = br.readLine();
        String s3[] = s2.split(" ");
        int n = Integer.parseInt(s3[0]);
        int m = Integer.parseInt(s3[1]);
        int k = Integer.parseInt(s3[2]);
        char a[][] = new char[n][m];
        for (int i = 0; i <n ; i++) {
            String s4 = br.readLine();
            a[i] =s4.toCharArray();
        }
        System.out.println(Arrays.deepToString(a));



        System.out.println(countMatrix(a,k));
    }

    static int countMatrix(char a[][], int k){
        int count=0;
        int max=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                int p=i,q=j;
                while(p<a.length&&p<i+k){
                    while(q<a.length &&q<j+k) {
                        if (a[p][q] == '*') count++;
                        q++;
                    }
                    q=0;
                    p++;
                }

                if(count>max)max=count;
                count=0;
            }
        }
        return max;
    }
}
