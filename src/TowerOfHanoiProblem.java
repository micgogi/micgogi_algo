/**
* @author Micgogi
* on 12/24/2019  6:56 PM
* Micgogi
*/
public class TowerOfHanoiProblem {
   public static void main(String[] args) {
    int n = 4;
    towerOfHanoiProblem(n,'A','B','C');
   }
   public static void towerOfHanoiProblem(int n, char from, char mid, char to){
       if(n==1){
           System.out.println("move disk 1 "+from+" "+to);
           return n;
       }
     towerOfHanoiProblem(n-1,from, mid,to);
     System.out.println("move disk"+n+" from"+from+" to"+to);
     towerOfHanoiProblem(mid,from,to);
     

   }
}
