package LCApr21Challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Micgogi
 * on 12/14/2019  7:13 PM
 * Micgogi
 */
public class LC17 {
    Map<Character, String> map = new HashMap<>();
    List<String> answer = new ArrayList<>();

    public List<String> letterCombinations(String digit) {

        if (digit == null || digit.equals("")) return answer;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        generate(digit.toCharArray(), 0, new char[digit.length()]);
        return answer;

    }

    public void generate(char[] numbers, int index, char[] c) {
        if (index == numbers.length) answer.add(new String(c));
        else {
            char chars[] = map.get(numbers[index]).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                c[index] = chars[i];
                generate(numbers, ++index, c);
                index--;

            }
        }
    }
}
