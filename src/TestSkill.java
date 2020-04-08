import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * @author Micgogi
 * on 4/7/2020  10:08 PM
 * Rahul Gogyani
 */


public class TestSkill {
    //[4,7]
    //[7,9]
    //[1,1,2,7]
    //[1,1,2,13]
    //3 9 3 7 6 4 8
    //7 9 3 8 1 5 1

    static void check(int nums1[],int nums2[]){
        int i=0;
        int n= nums1.length;
        int j=i;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n && j<n){
            if(map.size()>2)break;
            if(nums1[i]==nums2[j]){
                i++; j++;
            }
            else if(nums1[i]<nums2[j]){
                if(!map.containsKey(nums1[i]))
                    map.put(nums1[i],1);
                i++;
            }
            else if(nums1[i]>nums2[j]){
                if(!map.containsKey(nums2[j]))
                    map.put(nums2[j],2);
                j++;
            }
        }
        if(j==n-1)map.put(nums2[j],2);
        if(i==n-1)map.put(nums1[i],1);
        System.out.println(map);
        if(map.size()==0) System.out.println("Yes");
        else if(map.size()>2) System.out.println("No");
        else{
            int sum=0;
            int a[]=new int[2];
            i=0;
            for(int e:map.keySet()){
                a[i]=e;
                i++;
            }
            // System.out.println(a[1]-a[0]+" "+map.get(a[0]));
        }

    }


    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                int a[] = new int[n];
                int b[] = new int[n];
                String s1[] = br.readLine().split(" ");
                String s2[] = br.readLine().split(" ");
                for (int i = 0; i <s1.length ; i++) {
                    a[i]=Integer.parseInt(s1[i]);
                }
                for (int i = 0; i <s2.length ; i++) {
                    b[i]=Integer.parseInt(s2[i]);
                }
                check(a,b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}