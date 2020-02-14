/*
 *@author Rahul Gogyani
 *
 * 9:20 AM 2/14/2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LC76 {
    public static void main(String[] args) {
      try {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String s = br.readLine();
          String t = br.readLine();
          HashMap<Character, Integer> map = new HashMap<>();
          for (Character c : t.toCharArray()) {
              if (!map.containsKey(c)) {
                  map.put(c, 1);
              } else {
                  map.put(c, map.get(c) + 1);
              }
          }
          int b = 0, e = 0;
          int count = map.size();
          String res = "";
          int len = Integer.MAX_VALUE;
          while (e < s.length()) {
              char c = s.charAt(e);
              if (map.containsKey(c)) {
                  map.put(c, map.get(c) - 1);
                  if (map.get(c) == 0) {
                      count--;

                  }
              }
              e++;
              while (count == 0) {
                  if (e - b < len) {
                      len = e - b;
                      res = s.substring(b, e);
                  }

                  char bc = s.charAt(b);
                  if (map.containsKey(bc)) {
                      map.put(bc, map.get(bc) + 1);
                      if (map.get(bc) > 0) count++;
                  }

                  b++;
              }
          }
          System.out.println(res);
      }catch (Exception e){
          
      }
    }
}
