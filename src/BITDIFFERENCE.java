import java.util.Scanner;
public class BITDIFFERENCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s1 = Integer.toString(a,2);
            String s2 = Integer.toString(b,2);
            for (int i = 0; i <16 ; i++) {
                if(s1.length()!=16){
                    s1='0'+s1;
                }if(s2.length()!=16){
                    s2='0'+s2;
                }
            }
            int count =0;
            for (int i = 0; i <16 ; i++) {
                if(s1.charAt(i)!=s2.charAt(i)){
                    count++;
                }
            }
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(count);
        }
    }
}
