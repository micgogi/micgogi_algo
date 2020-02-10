import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CC_CASH {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
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
                int  c[] = {0,1,2,3};
                int i=0;
                    while(i<=n) {
                        int max=0;
                        for (int j = 0; j < 4; j++) {
                            if(a[j][i]>max){
                                max=a[j][i];
                            }

                        }
                        no.add(max);
                        max=0;
                        i++;
                    }

                System.out.println(no);

            }
        }catch (Exception e){

        }
    }
}
