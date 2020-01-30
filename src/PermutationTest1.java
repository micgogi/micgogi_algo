import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationTest1 {
    public static String swap(String s, int l , int r){
        char c[] = s.toCharArray();
        char temp = c[l];
        c[l]= c[r];
        c[r]=temp;
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0){
            String s = sc.nextLine();
            List<Character> ls = new ArrayList<>();
            pemrute(s,0,s.length()-1,ls);
            for (int i = 0; i <ls.size() ; i++) {
                System.out.print(ls.get(i)+" ");
            }
            System.out.println();


        }


    }
    public static void pemrute(String s , int l ,int r, List ls){
        if(l==r){
            ls.add(s);
        }else{
            for (int i = l; i <=r ; i++) {
               s = swap(s,l,i);
                pemrute(s,l+1,r,ls);
                s = swap(s,l,i);

            }

        }

    }
}
