import java.util.ArrayList;

/**
 * @author Micgogi
 * on 4/10/2020  11:04 AM
 * Rahul Gogyani
 */
public class LC443 {
    public static void main(String[] args) {
        char a[] = {'a'};
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add(a[0]);
        int count=1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]!=a[i-1]){
                String count1=""+count;
                if(count1.length()==1){

                }else{
                    
                }
                arrayList.add((""+count).charAt(0));
                arrayList.add(a[i]);
                count=1;
            }else{
                count++;
            }
        }
        arrayList.add((""+count).charAt(0));
        System.out.println(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            a[i]=arrayList.get(i);
        }

    }
}
