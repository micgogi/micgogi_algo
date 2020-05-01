package LCAprilChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Micgogi
 * on 4/6/2020  12:54 PM
 * Rahul Gogyani
 */
public class LC49 {

    static class StrCount{
        int count;
        boolean vis;
        public StrCount(int count, boolean vis){
            this.count = count;
            this.vis = vis;
        }
    }
    public static void main(String[] args) {
//expected [["sop"],["dis","sid","sid"],["sin"],["gem"],["pen"],["nev"],["oar"],["rob"],["ivy"],["eco"],["bad"],["ron"],["rag"],["bet"],["lox"],["buy","buy"],["sod"],["tho"],["cam","mac"],["say"],["orr"],["sen"],["pot"],["foe"],["fog"],["err"],["gay"],["len"],["wed"],["wis"],["big"],["col"],["had"],["tex"],["san"],["ump"],["kid"],["cat"],["ani"],["eta"],["dot"],["ham"],["paw"]]
        //output [["rag"],["orr"],["err"],["bad"],["foe"],["ivy"],["tho"],["gem"],["len"],["cat"],["ron"],["ump"],["nev"],["cam","mac"],["pen"],["dis","sid"],["rob"],["tex"],["sin"],["col"],["buy","buy"],["say"],["big"],["wed"],["eco"],["bet"],["fog"],["san"],["kid"],["lox"],["sen"],["ani"],["eta"],["wis"],["pot"],["dot"],["ham"],["gay"],["oar"],["had"],["paw"],["sod"],["sop"]]
        String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        HashMap<String, StrCount> visited = new HashMap<>();
//        for (int i = 0; i <s.length ; i++) {
//
//            visited.putIfAbsent(s[i],new StrCount(0,false));
//            StrCount strCount = visited.get(s[i]);
//            strCount.count=strCount.count+1;
//            visited.put(s[i],strCount);
//
//        }
//
//        List<List<String>> result = new ArrayList<>();
//        for (int i = 0; i <s.length ; i++) {
//            if(!visited.get(s[i]).vis){
//                List<String> list = new ArrayList<>();
//                StrCount strCount = visited.get(s[i]);
//                strCount.vis=true;
//                while (strCount.count!=0){
//                    list.add(s[i]);
//                    strCount.count--;
//                }
//                visited.put(s[i],strCount);
//
//                for (int j = i+1; j <s.length ; j++) {
//                    if(!visited.get(s[j]).vis){
//                        if(anagram(s[i],s[j])){
//                            StrCount strCount1 = visited.get(s[j]);
//                            strCount1.vis=true;
//                            while (strCount1.count!=0){
//                                list.add(s[j]);
//                                strCount1.count--;
//                            }
//
//                        }
//                    }
//                }
//
//                result.add(list);
//            }
//
//        }
//        System.out.println(result);


        System.out.println(groupAnagrams(s));
    }

    public static boolean anagram(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.putIfAbsent(s1.charAt(i), 0);
            map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            map.putIfAbsent(s2.charAt(i),0);
            map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            if(map.get(s2.charAt(i))==0){
                map.remove(s2.charAt(i));
            }
        }
        if(map.size()>0){
            return false;
        }
        return true;
    }


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
