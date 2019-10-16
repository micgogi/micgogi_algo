import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class  BeautifulDayAtTheMovie {

    // Complete the beautifulDays function below.

    static int beautifulDays(int i, int j, int k) {
        int count =0;
        for(int a=i;a<=j;a++){

            if( Math.abs(a-rev(a))%k==0)count++;
        }
        return count;
    }
    public static int rev(int n){
        int rev=0;
        while(n!=0){

            rev = rev*10+ n%10;
            n=n/10;
        }
        return rev;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
