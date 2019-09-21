import java.util.Arrays;

public class My1 {

    public static void main(String args[]){
       int a[] = {5,58,7,8,9,2,1};
       for(int i=1;i<a.length;i++){
           int j=i-1;
           int key = a[i];
           while(j>=0&&a[j]>key){
               a[j+1]=a[j];
               j=j-1;
           }
           a[j+1]=key;

       }

        System.out.println(Arrays.toString(a));
    }
}
