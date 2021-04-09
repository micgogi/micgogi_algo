package LCApr21Challenge;

/**
 * @author Micgogi
 * on 4/9/2021  5:46 PM
 * Rahul Gogyani
 */
public class LC953 {
    public static void main(String args[]) {
        System.out.println(isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int[] a = new int[26];
        for (int i = 0; i < order.length(); i++) {
            a[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length-1 ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                if(j>=words[i+1].length())return false;
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    if(a[words[i].charAt(j)-'a']>a[words[i+1].charAt(j)-'a'])return false;
                    else break;
                }
            }
        }
        return true;
    }
}

