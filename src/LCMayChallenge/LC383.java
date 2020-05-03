package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/3/2020  12:58 PM
 * Rahul Gogyani
 */
public class LC383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            a[ransomNote.charAt(i)-'a']--;
        }
        for(int i=0;i<magazine.length();i++){
            a[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s="kintaa";
        String m ="antaki";
        System.out.println(canConstruct(s,m));
    }
}
