import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

/**
 * @author Micgogi
 * on 3/31/2020  5:09 PM
 * Rahul Gogyani
 */
public class TEST123 {



    public static void main(String[] args) {
        for (int i	=	0,j	=	0;	i	<	10;	i++,j--)	{
            System.out.print(j);
        }
      try{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int t = Integer.parseInt(br.readLine());
          while(t--!=0){
              int n = Integer.parseInt(br.readLine());
              String bin = Integer.toString(n,2);
            ///  System.out.println(permute(bin.toCharArray()));
              List<String> listOfBits= permute(bin.toCharArray());
              int output=0;
              for(String bits : listOfBits){

                  output=output+Integer.parseInt(bits,2);


              }
              System.out.println(output);
          }
      }catch (Exception e){

      }


    }


    public static List<String> permute(char input[]) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char ch : input) {
            countMap.compute(ch, (key, val) -> {
                if (val == null) {
                    return 1;
                } else {
                    return val + 1;
                }
            });
        }
        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        List<String> resultList = new ArrayList<>();
        char result[] = new char[input.length];
        permuteUtil(str, count, result, 0, resultList);
        return resultList;
    }

    public static void permuteUtil(char str[], int count[], char result[], int level, List<String> resultList) {
        if (level == result.length) {
            resultList.add(new String(result));
            return;
        }

        for(int i = 0; i < str.length; i++) {
            if(count[i] == 0) {
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1, resultList);
            count[i]++;
        }
    }


}
