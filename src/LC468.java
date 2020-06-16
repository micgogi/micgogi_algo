/**
 * @author Micgogi
 * on 6/16/2020  1:12 PM
 * Rahul Gogyani
 */
public class LC468 {
    public static void main(String[] args) {
        String s = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        if(ipv4(s)){
            System.out.println("IPv4");
        }else if(ipv6(s.toUpperCase())){
            System.out.println("IPv6");
        }else{
            System.out.println("Neither");
        }
    }

    private static boolean ipv4(String s){
        int count =0;
        for (char c : s.toCharArray()){
            if(c=='.')count++;
        }
        if(count!=3)return false;
        String[] field = s.split("\\.");
        if(field.length!=4)return false;
        for (String f:field){
            if(f.isEmpty()||f.length()>3)return false;
            for (int i = 0; i <f.length() ; i++) {
                if(!Character.isDigit(f.charAt(i))){
                    return false;
                }
            }
            int num = Integer.valueOf(f);
            if(!String.valueOf(num).equals(f)||num<0||num>255){
                return false;
            }
        }
        return true;
    }
    private static boolean ipv6(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(c==':')count++;
        }
        if(count!=7)return false;
        String fields[] = s.split(":");
        if(fields.length!=8)return false;
        for (String f:fields){
            if(f.isEmpty()||f.length()>4)return false;

            for (int i = 0; i <f.length() ; i++) {
                if(!Character.isDigit(f.charAt(i))&&(f.charAt(i)<'A'||f.charAt(i)>'F'))
                    return false;
            }
        }
        return true;
    }
}
