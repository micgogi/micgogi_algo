package LCJuneChallenge;/*
 *@author Rahul Gogyani
 *
 * 12:01 PM 3/11/2020
 */



public class LC287 {
    public static void main(String[] args) {
        int a[] = {1,3,4,2,2};
      int slow =0,fast =0;
      do{
        slow = a[slow];
        fast = a[a[fast]];
      }while (slow!=fast);
      slow=0;
      while (slow!=fast){
          slow = a[slow];
          fast = a[fast];
      }
        System.out.println(slow);

    }
}
