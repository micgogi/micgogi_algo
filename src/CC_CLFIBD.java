import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 11/24/2019  7:42 PM
 * 65 78 75 73 84 65
 */
public class CC_CLFIBD {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i <n ; i++) {
                String s = br.readLine();
                int a[] = new int[26];
                for (int j = 0; j <26 ; j++) {
                    a[j]=0;
                }
                for (int j = 0; j < s.length(); j++) {
                    a[s.charAt(j)-'a']++;
                }
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
                ArrayList<Integer> b = new ArrayList<>();
                for (int j = 0; j <a.length ; j++) {
                    if(a[j]!=0){
                        b.add(a[j]);

                    }
                }

                boolean flag=false;

                if(b.size()>=3){
                    for (int j = 2; j <b.size() ; j++) {
                        if(b.get(j)==(b.get(j-1)+b.get(j-2))){
                            flag = true;
                        }else{
                            flag =false;
                        }
                    }
                }else{
                    flag=true;
                }

                if(flag) System.out.println("Dynamic");
                else System.out.println("Not");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
