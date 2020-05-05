import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 5/5/2020  5:24 PM
 * Rahul Gogyani
 */
public class LC78Test {

    public static void main(String[] args) {
             int a[] ={1,2,2};
             List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);;
        backtrack(list, new ArrayList<>(), a, 0);
        System.out.println(list);
    }

    private static void backtrack(List<List<Integer>> list, ArrayList<Integer> list1, int[] a, int start) {
        list.add(new ArrayList<>(list1));
   for(int i=start;i<a.length;i++){
     if(i>start&&a[i]==a[i-1])continue;
       list1.add(a[i]);
       backtrack(list,list1,a,i+1);
       list1.remove(list1.size()-1);
   }
    }


}
