package LCSeptChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 9/25/2020  3:30 PM
 * Rahul Gogyani
 */
public class LC179 {
    public static void main(String args[]) {
        int[] nums = {65, 78, 75, 73, 84, 65};
        String[] st = new String[nums.length];

        for (int i = 0; i < st.length; i++) {
            st[i] = "" + nums[i];
        }
        Arrays.sort(st, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        StringBuilder sb = new StringBuilder();
        for (int i = nums.length-1;i>=0;i--){
            sb.append(nums[i]);
        }
        if(sb.charAt(0)=='0'){
            System.out.println(0);
            return;
        }
        System.out.println(sb.toString());
    }

}

