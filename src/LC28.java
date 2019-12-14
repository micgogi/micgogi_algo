/**
 * @author Micgogi
 * on 12/14/2019  7:14 PM
 * Micgogi
 */
public class LC28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }

    }
}

