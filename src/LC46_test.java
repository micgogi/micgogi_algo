import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 12/9/2019  11:25 PM
 * Micgogi
 */
public class LC46_test {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        // permut(a, a.length);

        List<List<Integer>> b = permute(a);
        for (List<Integer> li:b){
            System.out.println(li.toString());
        }

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> choices = new ArrayList<>(nums.length);
        for (int i : nums) {
            choices.add(i);
        }

        permute(choices, new ArrayList<>(), answer);
        return answer;
    }

    public  static void permute(List<Integer> choices, List<Integer> decisionSoFar, List<List<Integer>> answer) {
        if (choices.isEmpty()) {
            answer.add(decisionSoFar);
            return;
        }

        for (int i = 0; i < choices.size(); i++) {

            List<Integer> newChoices = new ArrayList<>(choices);
            List<Integer> decisions = new ArrayList<>(decisionSoFar);

            decisions.add(newChoices.remove(i));

            permute(newChoices, decisions, answer);
        }


    }


}

