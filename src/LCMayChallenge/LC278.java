package LCMayChallenge;

/**
 * @author Micgogi
 * on 5/1/2020  9:00 PM
 * Rahul Gogyani
 */


public class LC278 {
    public int firstBadVersion(int n) {
        int left =0;
        int right=n;
        while(left<right){
            int mid= left+(right-left)/2;
            if(isBadVersion(mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean isBadVersion(int n){
        //You are given an API bool isBadVersion(version)
// which will return whether version is bad.
// Implement a function to find the first bad version.
// You should minimize the number of calls to the API
        /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
       LC278
       */
        return true;
    }
}
