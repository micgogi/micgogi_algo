import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Micgogi
 * on 12/14/2019  7:14 PM
 * Micgogi
 */
public class LC23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> n = new ArrayList<>();
        if(lists==null||lists.length==0)return null;
        boolean flag = false;
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if(flag)return null;

        for(ListNode temp: lists){
            while(temp!=null){
                n.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(n);
        ListNode head4 = new ListNode(n.get(0));
        for (int i = 1; i <n.size() ; i++) {
            ListNode temp = new ListNode(n.get(i));
            ListNode temp1 = head4;
            while(temp1.next!=null){
                //System.out.println(temp1.data);
                temp1 = temp1.next;
            }
            temp1.next = temp;
        }
        // while(head4!=null){
        //    // System.out.println(head4.data);
        //     head4= head4.next;
        // }
        return head4;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);
        ListNode list[] = new ListNode[3];
        list[0]=head1;
        list[1]=head2;
        list[2]=head3;
        ListNode head4 = mergeKLists(list);
        while (head4!=null){
            System.out.print(head4.val+"-->");
            head4 = head4.next;
        }
    }
}
