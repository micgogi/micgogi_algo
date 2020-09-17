package LCSeptChallenge;

/**
 * @author Micgogi
 * on 9/17/2020  12:49 PM
 * Rahul Gogyani
 */
public class LC1041 {
    public static void main(String args[]) {
        System.out.println(isRobotBound("GGLLRR"));
    }

    public static boolean isRobotBound(String instructions) {
        int x = 0, y = 0, i = 0;
        int d[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int j = 0; j < instructions.length(); j++) {
            if (instructions.charAt(j) == 'R') {
                i = (i + 1) % 4;
            } else if (instructions.charAt(j) == 'L') {
                i = (i + 3) % 4;
            } else {
                x += d[i][0];
                y += d[i][1];
            }
        }
        return x ==0 && y==0 || i>0;
    }
}

