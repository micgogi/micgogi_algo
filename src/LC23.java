import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Micgogi
 * on 12/14/2019  7:14 PM
 * Micgogi
 */
public class LC23 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
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
}
