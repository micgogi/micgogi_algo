import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/11/2021  6:49 PM
 * Rahul Gogyani
 */
public class TopKFrequntlymentionedKeyword {
    public static void main(String args[]) {
        System.out.println(popularNFeatures(6,2, Arrays.asList("storage","battery",
                "hover","alexa","waterproof","solar"),7,Arrays.asList("I wish my kindle had even more storage",
                        "I wish the battery life on my kindle lasted 2 years",
                        "I read in the bath and would enjoy a waterproof kindle","waterproof and increased battery are my top requests",
                "I want to take my kindle into the shower. waterproof please waterproof!","It would be neat if my kindle would hover on" +
                        "my desk when not in use","How cool would it be uf my kindle charged int the sun via solar power")));
    }
    public static ArrayList popularNFeatures(int numFeatures, int topFeatures,
                                      List possibleFeatures, int numFeatureRequests, List featureRequests)
    {
        ArrayList<String> result = new ArrayList<>();
        int[] count = new int[numFeatures];
        for (int i = 0; i < numFeatureRequests; i++) {
            String request = (String) featureRequests.get(i);
            for (int j = 0; j < numFeatures; j++) {
                if (request.contains((String) possibleFeatures.get(j))) {
                    count[j]++;
                }
            }
        }
        for (int i = 0; i < topFeatures; i++) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < numFeatures; j++) {
                if (count[j] > max) {
                    max = count[j];
                    index = j;
                }
            }
            result.add((String) possibleFeatures.get(index));
            count[index] = 0;
        }
        return result;
    }
}

