import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Micgogi
 * on 5/4/2020  12:11 PM
 * Rahul Gogyani
 */
public class A118 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s  = br.readLine().toLowerCase();
            StringBuilder sb = new StringBuilder();
            for(char c: s.toCharArray()){
                if(c!='a'&&c!='y'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
                    sb.append("."+c);
                }
            }
            System.out.println(sb.toString());
        }catch (Exception e){

        }
    }
}
