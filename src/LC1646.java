/**
  * @author Micgogi
  * on 1/15/2021  8:49 PM
  * Rahul Gogyani
  */

public class LC1646 {
    int arr[] = new int[101];


    public int getMaximumGenerated(int n) {
        fill();
        int max = 0;
        for(int i=1;i<=n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public void fill(){
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=100;i++){
            if((i&1)==1){
                arr[i] = arr[i/2]+arr[i/2+1];
            }else{
                arr[i] = arr[i/2];
            }
        }
    }
}

