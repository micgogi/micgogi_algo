import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/10/2021  6:37 PM
 * Rahul Gogyani
 */
public class LC4Pract1 {
    public static void main(String args[]) {
        System.out.println(findMedianSortedArrays(new int[]{1,2,9,10},new int[]{6,7,8,9,10}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int x = nums1.length;
        int y = nums2.length;
        int low = 0;
        int high = x;
        while (low<=high){
            int partitionX = (low+high)/2;
            int partitionY = (x+y+1)/2-partitionX;
            int maxLeftX = (partitionX==0)?Integer.MIN_VALUE:nums1[partitionX-1];
            int minRightX = (partitionX==x)?Integer.MAX_VALUE:nums1[partitionX];
            int maxLeftY = (partitionY==0)?Integer.MIN_VALUE:nums2[partitionY-1];
            int minRightY = (partitionY==y)?Integer.MAX_VALUE:nums2[partitionY];
            if(maxLeftX<=minRightY&&maxLeftY<=minRightX){
                if((x+y)%2==0){
                    return (Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2.0;
                }else{
                    return Math.max(maxLeftX,maxLeftY);
                }
            }else if(maxLeftX>minRightY){
                high = partitionX-1;
            }else{
                low = partitionX+1;
            }

        }
        return 0;

    }
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j =0;
        int c[] = new int[m+n];
        int currentIndex =0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                c[currentIndex] = nums1[i];
                i++;
            }else{
                c[currentIndex] = nums2[j];
                j++;
            }
            currentIndex++;
        }
        while(i<m){
            c[currentIndex++] = nums1[i++];
        }
        while(j<n){
            c[currentIndex++] = nums2[j++];
        }

        if (c.length%2==0) {
            return (c[c.length/2]+c[c.length/2-1])/2.0;
        }else {
            return c[c.length/2];
        }
    }
}

