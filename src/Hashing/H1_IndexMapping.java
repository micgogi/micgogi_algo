package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 12/28/2019  5:52 PM
 * Micgogi
 */
public class H1_IndexMapping {
    final static int MAX=1000;
    static boolean has[][] = new boolean[MAX+1][2];
    static boolean search(int x){
        if(x>=0){
            if(has[x][0]==true){
                return  true;
            }else{
                return false;
            }
        }
        x= Math.abs(x);
        if (has[x][1]==true){
            return true;
        }
            return false;

    }
    static void insert(int a[], int n){
        for (int i = 0; i <n ; i++) {
            if(a[i]>=0){
                has[a[i]][0]=true;
            }else{
                has[Math.abs(a[i])][1]=true;
            }
        }

    }
    public static void main(String[] args)  {
        int a[] = {-1,9,-5,-8,-5,-2};
        insert(a, a.length);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            if(search(n)){
                System.out.println("Found");
            }else {
                System.out.println("Not Found");
            }

        }catch (Exception e){
            System.out.println("Hiiiiiiiii");
        }

    }
}
