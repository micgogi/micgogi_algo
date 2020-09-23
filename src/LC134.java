import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/23/2020  6:57 PM
 * Rahul Gogyani
 */
public class LC134 {
    public static void main(String args[]) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int diff_total = 0;
        for (int i = 0; i < gas.length; i++) {
            diff_total += gas[i] - cost[i];
        }
        if (diff_total < 0) return -1;
        else {
            int starting = 0, tank = 0;
            for (int i = 0; i < gas.length; i++) {
                tank += gas[i] - cost[i];
                if (tank < 0) {
                    starting = i + 1;
                    tank = 0;
                }
            }
            return starting;
        }
    }

}

