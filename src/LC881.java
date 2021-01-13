import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/13/2021  4:33 PM
 * Rahul Gogyani
 */
public class LC881 {
    public static void main(String args[]) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int ans = 0;
        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit) i++;
            j--;
        }
        return ans;
    }
}

