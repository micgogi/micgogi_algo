package LCJulyChallenge;

/**
 * @author Micgogi
 * on 7/28/2020  1:28 PM
 * Rahul Gogyani
 */
public class LC621 {
    public static void main(String args[]) {
        char task[] = {'A','A','K','K','I','I','A','A','N','N','T','T'};
        int n =2;
        char count[] = new char[26];
        for (char c:task){
            count[c-'A']++;
        }
        int max=0;
        int cnt =1;
        for (int c:count){
            if (c==0)continue;
            if(c<max){
                max=c;
                cnt=1;
            }else if(max==c){
                cnt++;
            }
        }
        int total = (n+1)*(max-1)+cnt;
        System.out.println(total<task.length?task.length:total);
    }


}

