import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/13/2021  4:21 PM
 * Rahul Gogyani
 */
public class MinimumMoves {
    public static void main(String args[]) {
        System.out.println(minMoves(12, new int[]{20,14,13,15,14,18,10,14,17,10,14,11}, 6));
    }
    //you have given an array of size N and you have to find the minimum number of moves to make the array good
    //the array is good if a[i]<=a[i+k]
    //Input:
    //4
    //2 4 1 3
    //2
    //Output:
    //2
//    public static int minMove(int n, int[] arr, int k) {
//
//    }
//    public static int minMove(int n, int[] arr, int k) {
//
////        int count = 0;
////        for (int i = 0; i < n; i++) {
////            if (i+k<n && arr[i] <= arr[i + k]) {
////                continue;
////            } else if(i+k<n) {
////                arr[i]=arr[i+k];
////                count++;
////            }
////        }
////        return count;
//    }
    public static int minMoves(int n, int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < n; j += k) {
                list.add(arr[j]);
            }
            System.out.println(list);
            System.out.println(lengthOfLIS(list.stream().mapToInt(Integer::intValue).toArray()));

            count += (list.size() - lengthOfLIS(list.stream().mapToInt(Integer::intValue).toArray()));
        }
        return count;

    }
//    public static int lengthOfLis(int[] nums) {
//        List<Integer> piles = new ArrayList<>(nums.length);
//        for (int num : nums) {
//            int pile = Collections.binarySearch(piles, num);
//            if (pile < 0) pile = ~pile;
//            if (pile == piles.size()) {
//                piles.add(num);
//            } else {
//                piles.set(pile, num);
//            }
//        }
//        return piles.size();
//    }
    public static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] <= x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
    public static int minSwaps(int[] arr, int N) {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int indexOf(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

}

