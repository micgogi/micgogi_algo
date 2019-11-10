import java.util.Scanner;

public class CodeChef2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            float w = sc.nextFloat();
            float total = sc.nextFloat();

            if(w%5==0&&w>0&&w<total){

                System.out.printf("%.2f",total-w-0.5);
            }else {
                System.out.printf("%.2f",total);
            }

        }
    }
}
