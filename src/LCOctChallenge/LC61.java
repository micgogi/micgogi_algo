package LCOctChallenge;

/*
 *@author Rahul Gogyani
 * 
 * 
 */
public class LC61 {
    static ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode temp = head;
        int t=0;

        while(temp!=null){
            t++;
            temp = temp.next;
        }

        int k =0;
        int q = k%t;
        int m = t-q;

        ListNode temp1 = head;
        while(m!=1){
            temp1 = temp1.next;
            m--;
        }
            if(temp1.next!=null) {
                ListNode rem = temp1.next;
                temp1.next = null;
                ListNode temp2 = rem;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }
                temp2.next = head;

                while (rem != null) {
                    System.out.println(rem.val);
                    rem = rem.next;
                }

            }else{
            while(head!=null){
                System.out.println(head.val);
                head= head.next;
            }
            }


    }
}
