public class SegemnetTree {
    int st[];
    SegemnetTree(int arr[] , int n){

        int x =(int) Math.ceil(Math.log(n)/Math.log(2));
        int max_size = 2*(int)Math.pow(2,x)-1;
        st = new int[max_size];
        constructUtil(arr, 0, n-1,0);


    }
    int getMid(int low, int high) {
        return low + (high - low) / 2;
    }
    int getSum(int n, int qs , int qe){
        if(qs<0||qe>n-1){
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0,n-1,qs,qe,0);
    }
    int getSumUtil(int ss, int se, int qs , int qe,int si){
        if(qs<=ss&&qe>=se){
            return st[si];
        }
        if(se<qs||ss>qe){
            return 0;
        }
        int mid = getMid(ss, se);
        return getSumUtil(ss, mid,qs, qe, 2*si+1)+getSumUtil(mid+1,se,qs,qe,2*si+2);
    }
    private int  constructUtil(int[] arr, int ss, int se, int si) {
        if(ss==se){
            st[si]=arr[ss];
            return arr[ss];
        }
        int mid = getMid(ss,se);
        st[si]= constructUtil(arr,ss,mid,si*2+1)+constructUtil(arr,mid+1,se,si*2+2);
        return st[si];
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11};
        int n = arr.length;
        SegemnetTree sg = new SegemnetTree(arr,n);
        System.out.println(sg.getSum(n,1,3));
    }
}
