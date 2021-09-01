package June21Challenge;

public class LC92 {
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
        head.next = new ListNode(3);
        ListNode res = reverseBetween(head,1,2);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }


    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode startNode = dummy;
        int i = 1;
        while(i < m && startNode != null){
            startNode = startNode.next;
            i++;
        }
        if(startNode == null || startNode.next == null) return head;
        ListNode pre = startNode.next;
        ListNode cur = pre.next;
        while(i < n && cur != null){
            pre.next = cur.next;
            cur.next = startNode.next;
            startNode.next = cur;
            cur = pre.next;
            i++;
        }
        return dummy.next;
    }



}

