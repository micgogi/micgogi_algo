public class Abs {
    public static void main(String[] args) {
        int a[] ={-1,-2,2,3,4};
        int absNum=Math.abs(a[0]);
        int abs=0;
        for(int i=1;i<a.length;i++){
             abs=Math.abs(a[i]);
            if(abs<absNum){
                absNum=abs;
            }
        }
        System.out.println(absNum);
    }
}
