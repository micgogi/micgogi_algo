/**
 * @author Micgogi
 * on 4/26/2020  9:39 AM
 * Rahul Gogyani
 */
public class LC45 {
    public static void main(String[] args) {
        int a[] = {2, 3, 1, 1, 4};
        System.out.println(jump(a));
    }

    public static int jump(int a[]) {
       int pos =0,n=a.length,count=0;
       while(pos<n-1){
           count++;
           int range = a[pos], next=a[pos];
           for (int i = 1; i <=a[pos] ; i++) {
            if(pos+i>=n-1)return count;
            if(i+a[pos+i]>range){
                range = i+a[pos+i];
                next=i;
            }
           }
           pos+=next;
       }
       return count;
    }
}
