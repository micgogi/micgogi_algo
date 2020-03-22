/**
 * @author Micgogi
 * on 3/22/2020  12:02 PM
 * Rahul Gogyani
 */
public class WTest3 {
    public static int findsubArray(int arr[], int k)
    {

        int n = arr.length;


        int res = n+1;
        for (int i = 0; i < n; i++) {


            int curr_prod = 0;
            for (int j = i; j < n; j++) {
                curr_prod = curr_prod + arr[j];
                if (curr_prod % k == 0 && res > (j-i+1))
                {
                    res = Math.min(res, j-i+1);
                    break;
                }
            }
        }
        return (res == n+1)? -1 : res;
    }

    public static void main(String[] args) {
        int a[] = {7 ,4 ,1, 2, 2, 9, 8, 9};
        System.out.println(findsubArray(a,14));
    }
}
