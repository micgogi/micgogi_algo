import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Micgogi
 * on 3/28/2020  12:04 AM
 * Rahul Gogyani
 */
public class Test55 {

    Scanner scan=new Scanner(System.in);
    int t=0;
    int n=0;


    List<String> result;
    List<String> output= new ArrayList<>();
    public void giveResult(){
        result=new ArrayList<>();
        System.out.println("Enter number of test cases...........");
        t=scan.nextInt();
        BufferedReader br ;
        if(1<=t && t<=10000)
            for(int i=0; i<t; i++){
                List<String> complexNumbers=new ArrayList<>();
                System.out.println("Enter number of complex numbers...........");
                n=scan.nextInt();
                if(2<=n && n<=10)
                    for (int j=0; j< n; j++){
                        System.out.println("Enter number of complexNo with units...........");
                        br=new BufferedReader(new InputStreamReader(System.in));
                        String input= null;
                        try {
                            input = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        complexNumbers.add(input);

                    }
                String[] afterSplit =null;


                int count=0;
                int initialA=0;
                int initialB=0;
                for(String complexNo : complexNumbers){

                    afterSplit = complexNo.split("\\s+");
                    int a= (int)Integer.parseInt(afterSplit[0]);
                    int b=    (int)Integer.parseInt(afterSplit[1]);
                    if(a>-10 && a<10 && b>-10 && b<10) {
                        if (count == 0) {
                            initialA = a;
                            initialB = b;
                            count++;
                        } else if (count > 0) {

                            int[] frommultiPly = multiPly(initialA, initialB, a, b);
                            initialA = frommultiPly[0];
                            initialB = frommultiPly[1];
                            count++;

                        }
                    }
                }

                output.add(Integer.toString(initialA)+" "+Integer.toString(initialB));


            }
        for(String strings : output){
            System.out.println(strings);
        }

    }
    private int [] multiPly(int a, int b, int c, int d){
        int left= (a*c)+(-1)*(b*d);
        int right= (a*d)+(b*c);
        int [] arrayToReturn=new int[2];
        arrayToReturn[0]=left;
        arrayToReturn[1]=right;

        return arrayToReturn;
    }

    public static  void main(String args [])
    {
        Test55 solution=new Test55();
        solution.giveResult();

    }
}
