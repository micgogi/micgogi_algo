/**
 * @author Micgogi
 * on 6/18/2020  5:44 PM
 * Rahul Gogyani
 */
public class LC744 {
    public static void main(String[] args) {
        char[] letters = {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u'
        ,'v','w','x','y','z'};
        char target = 'a';
        int left = 0;
        int right = letters.length-1;
        if(target>=letters[right]||target<letters[left]){
            System.out.println(letters[0]);
            return;
        }
        while (left<=right){
            int mid = left+(right-left)/2;
            if(mid>0&&(target>=letters[mid-1]&&letters[mid]>target)){
                System.out.println(letters[mid]);
                return;
            }
            else if(target>=letters[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        System.out.println(letters[left]);


    }
}
