/**
 * @author Micgogi
 * on 11/21/2021  9:31 AM
 * Rahul Gogyani
 */
public class LC997 {
    public static void main(String args[]) {
        System.out.println(new LC997().findJudge(2, new int[][]{{1,2}}));
    }
    public int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for(int[] t:trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <=N ; i++) {
            if(count[i]==N-1)return i;
        }
        return -1;
    }
}

