import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  2:13 PM
 * Rahul Gogyani
 */
public class LC926Test {
    public static void main(String[] args) {
        System.out.println(new LC926Test().minFlipsString("001100011000"));
    }
  public int minFlipsString(String s){
      int one=0,flips=0;
      for (int i = 0; i <s.length() ; i++) {
          if(s.charAt(i)=='1')one++;
          else flips++;
          flips = Math.min(flips,one);
      }
      return flips;
  }
}

