import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 11/16/2019  10:43 PM
 */
public class LC3 {
    static Node head1, head2, head3;
    static int carry;
    static Node curr;


    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }

    }

    public static void print(Node temp) {
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        head1 = new Node(0);

        head2  = new Node(0);

      // sameSize(head1,head2);
        addTwoList(head1,head2);
        print(head3);
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    public static void push(int data) {
        Node n = new Node(data);
        // System.out.println(data);
        Node temp = head3;
        if (temp == null) {
            head3 = n;
        } else {
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = n;
        }

    }

    static void sameSize(Node temp1, Node temp2) {
        if (temp1 == null) return;

        sameSize(temp1.next, temp2.next);
        int sum = temp1.data + temp2.data + carry;
        carry = sum / 10;
        sum = sum % 10;
        push(sum);
    }
    static int getSize(Node temp){
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return  count;
    }
    static  void propagateCarry(Node temp){
            if(temp!=curr){
                propagateCarry(temp.next);
                int sum = carry+temp.data;
                carry=sum/10;
                sum%=10;
                push(sum);
            }
    }
    static void addTwoList(Node f, Node t){
        if(f==null){
            head3 = t;
        }
        if (t==null){
            head3 = f;
        }
        int size1 = getSize(f);
        int size2 = getSize(t);
        if(size1 == size2){
            sameSize(f,t);
        }else{
            if(size1<size2){
                Node temp = f;
                f=t;
                t = temp;
            }
            int diff = Math.abs(size1-size2);
            Node temp = f;
            while(diff-->=0){
                curr = temp;
                temp = temp.next;
            }
            sameSize(curr,t);
            propagateCarry(f);

        }
        if (carry>0){
            push(carry);
        }
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int si=0,ci=0,max=0;

        for (; ci <s.length() ; ci++) {
            if(map.containsKey(s.charAt(ci))){
                si=Math.max(si,map.get(s.charAt(ci))+1);

            }
            map.put(s.charAt(ci),ci);
            max = Math.max(max,ci-si+1);
        }
        return max;
    }

}
