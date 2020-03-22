/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(calc(s));
        }

    }

    static int calc(String s){
        //1101001101
        int not=0;
        int count=0;
        int max=0;
        boolean check=true;
        for (int i = 0; i <s.length() ;) {
            //if(!check&&s.charAt(i)=='0')check=true;

            if(i<s.length()-1&&s.charAt(i)=='0'&&s.charAt(i+1)=='0'){
                //  check=false;
                while(i<s.length()&&s.charAt(i)=='0')i++;
                if(i==s.length())return max;
                count=0;
            }
            count++;
            i++;
            if(count>max)max=count;

        }
        return max;

    }
}
