package LCApr21Challenge;

class LC1551 {
    public static void main(String[] args){
      int n = 6;
      System.out.println(minOperations(n));
    }
    public static int minOperations(int n) {
     return n/2*(n/2+n%2);
    }
}
