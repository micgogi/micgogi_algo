/**
 * @author Micgogi
 * on 4/22/2020  2:40 PM
 * Rahul Gogyani
 */
public class LC852 {
    public static void main(String[] args) {
        int a[]={0,2,1,0};
        int n = a.length/2;
        int i=0;int index=0;
        if(a[n]>a[n-1]){
            int max = a[n];
            index=n;
            for (int j =n+1; j <a.length; j++) {
                if(max<=a[j]){
                    index=j;
                    max=a[j];
                }
            }
        }else{
            int max = a[n];
            index=n;
            for (int j =n-1; j >=0 ; j--) {
                if(max<=a[j]){
                    index=j;
                    max=a[j];
                }
            }
        }
        System.out.println(index);
    }
}
