package LCSeptChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 4/16/2020  12:39 PM
 * Rahul Gogyani
 */
public class LC229 {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(majorityElement(a));

//        int count =0;
//        int n = a.length;
//        Arrays.sort(a);
//        List<Integer> list = new ArrayList<>();
//        int i=0;
//        int j=0;
//        boolean add =false;
//        while(i<a.length&&j<a.length){
//
//            if(a[i]==a[j]){
//                count++;
//                j++;
//                if(count>n/3&&!add){
//                    list.add(a[i]);
//                    add=true;
//                }
//            }else{
//                add = false;
//                i=j;
//                count=0;
//
//
//            }
//        }
//        System.out.println(list);
    }

    // using  Boyer-Moore Majority Vote Algorithm.
    //https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html
    public static List<Integer> majorityElement(int[] a) {
        Integer num1 = null, num2 = null;
        int count1 = 0, count2 = 0;
        List<Integer> res = new ArrayList<>();
        for (int el : a) {
            if (num1!=null && el == num1) {
                count1++;
            } else if (num2!=null && el == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = el;
                count1 = 1;

            } else if (count2 == 0) {
                num2 = el;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        int firstCount = 0, secondCount = 0;

        for (int el : a) {
            if (num1 != null && el == num1) firstCount++;
            if (num2 != null && el == num2) secondCount++;
        }
        int n = a.length;
        if (firstCount > n / 3) res.add(num1);
        if (secondCount > n / 3) res.add(num2);


        return res;
    }
}
