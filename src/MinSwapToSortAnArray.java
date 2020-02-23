import java.util.HashMap;

/**
 * @author Micgogi
 * on 2/22/2020  10:48 PM
 * Micgogi
 */
public class MinSwapToSortAnArray {
    public static void main(String[] args) {
        int a[] = {1,4,3,2};
        boolean visited[] = new boolean[a.length+1];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <visited.length ; i++) {
            hashMap.put(i,a[i-1]);
        }
        int count=0;
        for (int i = 1; i <= hashMap.size(); i++) {
            int nextValue;
            if(!visited[i]){
                visited[i]=true;
                if(i==hashMap.get(i)){
                    continue;
                }else{
                    int c = hashMap.get(i);
                while (!visited[c]){
                    visited[c]=true;
                    nextValue=hashMap.get(c);
                    c=nextValue;
                    ++count;
                }

                }

            }

        }
        System.out.println(count);
    }
}
