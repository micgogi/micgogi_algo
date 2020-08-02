package LCAugustChallenge;

/**
 * @author Micgogi
 * on 8/2/2020  1:00 PM
 * Rahul Gogyani
 */
public class LC705 {
    public static void main(String args[]) {

    }

    /** Initialize your data structure here. */
    boolean set[];
    public LC705() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key];
    }
}

