package august21;

/**
 * @author Micgogi
 * on 8/13/2021  9:52 AM
 * Rahul Gogyani
 */
public class LC49 {
    public static List<List<String>> groupAnagrams(String[] str){
        HashMap<String,List<String>> map = new HashMap<>();
        String hash;
        List<String> list;
        for (String s: str){
            hash = getHash(s);
            list = map.getOrDefault(hash,new ArrayList<String>());
            list.add(s);
            map.put(hash,list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static String getHash(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

