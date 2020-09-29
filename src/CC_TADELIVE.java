
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Micgogi
 * on 3/29/2020  7:08 AM
 * Rahul Gogyani
 */
public class CC_TADELIVE {
    static class Tr{
        int a,b,c;
        Tr(int a, int b , int c){
            this.a = a;
            this.b = b;
            this.c =c;

        }
    }
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            int y = Integer.parseInt(s[2]);
           ArrayList<Integer> al = new ArrayList<>();
           ArrayList<Integer> bl = new ArrayList<>();
           ArrayList<Tr> lt = new ArrayList<>();
            String sx[] = br.readLine().split(" ");
            String sy[] = br.readLine().split(" ");
            for (int i = 0; i <n ; i++) {
                al.add(Integer.parseInt(sx[i]));
                bl.add(Integer.parseInt(sy[i]));
            }

            for (int i = 0; i < n; i++) {
                lt.add( new Tr(al.get(i),bl.get(i),Math.abs(al.get(i)-bl.get(i))));
            }
            Collections.sort(lt, new Comparator<Tr>() {
                @Override
                public int compare(Tr o1, Tr o2) {
                    return o1.c-o2.c;
                }
            });
            long max=0;
            for (int i = n-1; i >=0 ; i--) {
                if(y>x){
                    if(lt.get(i).a>lt.get(i).b&&x>0){
                        max+= lt.get(i).a;
                        x--;
                    }else if(lt.get(i).b>=lt.get(i).a&&y>0){
                        max+=lt.get(i).b;
                        y--;
                    }else if(x>0){
                        max+=lt.get(i).a;
                        x--;
                    }else if(y>0){
                        max+=lt.get(i).b;
                        y--;
                    }
                }else{
                    if(lt.get(i).a>=lt.get(i).b&&x>0){
                        max+=lt.get(i).a;
                        x--;
                    }else if(lt.get(i).a<lt.get(i).b&&y>0){
                        max+=lt.get(i).b;
                        y--;
                    }else if(y>0){
                        max+=lt.get(i).b;
                        y--;
                    }else if(x>0){
                        max+=lt.get(i).a;
                        x--;
                    }

                }
            }

            System.out.println(max);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
