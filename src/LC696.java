

/**
 * @author Micgogi
 * on 4/24/2021  3:36 PM
 * Rahul Gogyani
 */
public class LC696 {
    public static void main(String args[]) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        int[] group = new int[s.length()];
        group[0] = 1;
        int t = 0;
        for (int i = 1; i < s.length() ; i++) {
            if(s.charAt(i-1)!=s.charAt(i)){
                group[++t]=1;
            }else{
                group[t]++;
            }
        }
        int ans = 0;
        for (int i = 1; i <group.length ; i++) {
            ans+=Math.min(group[i-1],group[i]);
        }
       // System.out.println(Arrays.toString(group));
        return ans;
   }
}

