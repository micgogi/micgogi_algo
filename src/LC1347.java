/*
 *@author Ragul Gogyani

 *
 * 4:41 PM 3/9/2020
 */

public class LC1347 {
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
        int a[] = new int[26];
        int b[] = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            a[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <t.length() ; i++) {
            b[t.charAt(i)-'a']++;
        }
        int sum=0;
        for (int i = 0; i <26; i++) {
            a[i]=a[i]-b[i];
            if(a[i]>0){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }

}
