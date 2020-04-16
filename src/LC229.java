import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 4/16/2020  12:39 PM
 * Rahul Gogyani
 */
public class LC229 {
    public static void main(String[] args) {
        int a[] = {2,2};
        int count =0;
        int n = a.length;
        Arrays.sort(a);
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        boolean add =false;
        while(i<a.length&&j<a.length){

            if(a[i]==a[j]){
                count++;
                j++;
                if(count>n/3&&!add){
                    list.add(a[i]);
                    add=true;
                }
            }else{
                add = false;
                i=j;
                count=0;


            }
        }
        System.out.println(list);
    }
}
