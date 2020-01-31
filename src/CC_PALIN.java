import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CC_PALIN {
    static void generatePalibdorme(int a[]){
        if(isALl9(a)){
            System.out.print("1");
            for (int i = 0; i <a.length-1 ; i++) {
                System.out.print("0");
            }
            System.out.println("1");
        }else {
            generatePalibdormeUtil(a);
            printArray(a);
        }
    }
    static void generatePalibdormeUtil(int a[]){
        int mid = a.length/2;
        int i = mid -1;
        int j=(a.length%2==0)?mid:mid+1;
        boolean leftamller = false;
        while(i>=0&&a[i]==a[j]){
            i--;
            j++;
        }
        if(i<0||a[i]<a[j]){
            leftamller = true;
        }
        while (i>=0){
            a[j++]=a[i--];
        }
        if(leftamller){
            int carry = 1;
            if(a.length%2==1){
                a[mid]+=1;
                carry=a[mid]/10;
                a[mid]%=10;
            }
            i = mid-1;
            j = (a.length%2==0?mid:mid+1);
            while(i>=0){
                a[i]=a[i]+carry;
                carry = a[i]/10;
                a[i]%=10;
                a[j]=a[i];
                i--;
                j++;
            }
        }

    }
    static boolean isALl9(int num[]){
        for (int i = 0; i <num.length ; i++) {
            if(num[i]!=9){
                return false;
            }

        }
        return  true;
    }
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String s = br.readLine();
                int a[] = new int[s.length()];
                for (int i = 0; i < s.length(); i++) {
                    a[i]=Integer.parseInt(""+s.charAt(i));
                }
                generatePalibdorme(a);
            }
        }catch (Exception e){

        }




    }

}
