package LCAprilChallenge;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Micgogi
 * on 4/28/2020  2:58 PM
 * Rahul Gogyani
 */
public class LC_FirstUniqueNumber {
    private Set<Integer> unique;
    private Set<Integer> duplicates;
    public static void main(String[] args) {
        int a[] = {2,3,5,5,5};
        LC_FirstUniqueNumber l = new LC_FirstUniqueNumber(a);

    }

    public LC_FirstUniqueNumber(int[] nums) {
        unique = new LinkedHashSet<>();
        duplicates = new HashSet<>();
        for (int num:nums){
            if(!duplicates.contains(num)){
                if(!unique.contains(num)){
                    unique.add(num);
                }else{
                    unique.remove(num);
                    duplicates.add(num);
                }
            }
        }
        System.out.println(unique);
        System.out.println(duplicates);
    }

    public int showFirstUnique() {
        if(!unique.isEmpty())return unique.iterator().next();
        else return -1;
    }

    public void add(int value) {
        if(!duplicates.contains(value)){
            if(!unique.contains(value)){
                unique.add(value);
            }else{
                unique.remove(value);
                duplicates.add(value);
            }
        }
    }
}
