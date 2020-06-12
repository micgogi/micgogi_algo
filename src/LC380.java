import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author Micgogi
 * on 6/12/2020  12:45 PM
 * Rahul Gogyani
 */
public class LC380 {
    ArrayList<Integer> number;
    HashMap<Integer, Integer> hm;
    Random random = new Random();
    public static void main(String[] args) {
    LC380 lc380 = new LC380();
    lc380.insert(1);
    lc380.insert(2);
        System.out.println(lc380.remove(1));
    }
    public LC380(){
        number = new ArrayList<>();
        hm = new HashMap<>();
    }
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hm.containsKey(val))return false;
        hm.put(val,number.size());
        number.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hm.containsKey(val))return false;
        int index = hm.get(val);
        if(index<number.size()-1){
            int lastval = number.get(number.size()-1);
            number.set(index,lastval);
            hm.put(lastval,index);
        }
        hm.remove(val);
        number.remove(number.size()-1);
        return  true;


    }

    /** Get a random element from the set. */
    public int getRandom() {
        return number.get(random.nextInt(number.size()));
    }
}
