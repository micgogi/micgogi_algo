public class AlpCount {
    public static void main(String args[]){
        String s = "AAAABVVFFDWGWGDDHDHGDFGDBDGDD";
        int a[] = new int[255];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;

        }
        for(int i=0;i<s.length();i++){
                if(a[s.charAt(i)]!=0){
                    System.out.print(s.charAt(i)+""+a[s.charAt(i)]);
                    a[s.charAt(i)]=0;
                }


        }
    }
}
