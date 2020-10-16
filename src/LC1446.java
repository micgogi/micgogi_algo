public class LC1446 {
    public int maxPower(String s) {
       if(s.length() == 1)return 1;
        int count = 0;
        int max = 0;
        int j =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(j) == s.charAt(i)){
                count+=1;
            }else{
                j = i;
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
