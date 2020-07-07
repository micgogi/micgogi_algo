import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 7/7/2020  1:06 PM
 * Rahul Gogyani
 */
public class C1368 {
    static class Pair{
        long x,y;
        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            List<Pair> list = new ArrayList<>();
            list.add(new Pair(0,0));
            list.add(new Pair(0,1));
            list.add(new Pair(1,0));
            list.add(new Pair(1,1));
            while (n--!=0){
                long x = list.get(list.size()-1).x;
                long y = list.get(list.size()-1).y;
                list.add(new Pair(x+1,y));
                list.add(new Pair(x,y+1));
                list.add(new Pair(x+1,y+1));
            }
            System.out.println(list.size());
            for (Pair p:list){
                System.out.println(p.x+" "+p.y);
            }
        }catch (Exception e){

        }
    }
}
