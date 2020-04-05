import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/5/2020  10:52 AM
 * Rahul Gogyani
 */
public class Lc205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";




    }
    public boolean isIsmorohic(String s, String t){
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i))){
                if(!hashMap.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }

            if(hashMap.containsValue(t.charAt(i))&&!hashMap.containsKey(s.charAt(i))){
                return false;
            }
            hashMap.put(s.charAt(i),t.charAt(i));
        }

        return true;
    }
}
