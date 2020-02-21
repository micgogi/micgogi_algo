import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CC_THEATRE {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int total =0;
            while(t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[][] = new int[4][4];

                for (int i = 0; i <n ; i++) {
                    String s1 = br.readLine();
                    String s2[] = s1.split(" ");
                    String movie = s2[0];
                    Integer show =Integer.parseInt(s2[1]);

                    if(movie.equals("A")){
                        if(show==12){
                            a[0][0]++;
                        }
                        if(show==3){
                            a[0][1]++;
                        }
                        if(show==6){
                            a[0][2]++;
                        }
                        if(show==9){
                            a[0][3]++;
                        }
                    }
                    if(movie.equals("B")){
                        if(show==12){
                            a[1][0]++;
                        }
                        if(show==3){
                            a[1][1]++;
                        }
                        if(show==6){
                            a[1][2]++;
                        }
                        if(show==9){
                            a[1][3]++;
                        }

                    }
                    if(movie.equals("C")){
                        if(show==12){
                            a[2][0]++;
                        }
                        if(show==3){
                            a[2][1]++;
                        }
                        if(show==6){
                            a[2][2]++;
                        }
                        if(show==9){
                            a[2][3]++;
                        }

                    }
                    if(movie.equals("D")){
                        if(show==12){
                            a[3][0]++;
                        }
                        if(show==3){
                            a[3][1]++;
                        }
                        if(show==6){
                            a[3][2]++;
                        }
                        if(show==9){
                            a[3][3]++;
                        }
                    }

                }
                ArrayList<Integer> no = new ArrayList<>();

               int[] c={0,1,2,3};
               boolean founrd = false;

                int i=0;
                while(i<4) {
                    int max=0;
                    int index=0;
                    for (int j = 0; j < 4; j++) {
                        if((a[j][i] > max) && (c[j] == j)){
                            max=a[j][i];
                            index =j;
                            founrd = true;
                        }

                    }
                    no.add(max);
                    if(founrd) {
                        c[index] = -1;
                        founrd = false;
                    }
                    max=0;
                    i++;
                }
                long countNoOfZero=0;

               System.out.println(no);
                Collections.sort(no);
                System.out.println(no);
                long sum=0;
                long sp = 100;
                for (int j = no.size()-1; j>=0; j--) {
                    if(no.get(j)>0) {
                        sum += no.get(j) * sp;
                        sp = sp - 25;
                    }else{
                        countNoOfZero++;
                    }
                }
                long totalEmptyShow = countNoOfZero*100;
                total+=(sum-totalEmptyShow);
                System.out.println(sum-totalEmptyShow);
            }
            System.out.println(total);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
