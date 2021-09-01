package LCJan21Challenge;

/**
 * @author Micgogi
 * on 11/17/2019  9:34 PM
 *
 */
public class LC2_2 {
    static Node head1, head2,head3;
    static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node addTwoList(Node n1, Node n2){
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }
        Node temp = new Node(-1);
        Node l = temp;
        for (int carryOver=0;(n1!=null)||(n2!=null)||(carryOver>0);){
            boolean isL1Over=(n1==null);
            boolean isL2Over=(n2==null);
            int sum = carryOver+(isL1Over?0:n1.data)+(isL2Over?0:n2.data);
            carryOver = sum>9?1:0;
            sum = (sum>9)?sum-10:sum;
            l.next = new Node(sum);
            l = l.next;
            n1 =isL1Over?null:n1.next;
            n2 = isL2Over?null:n2.next;
            if((isL1Over||isL2Over)&&(!(isL1Over&&isL2Over))&&(carryOver==0)){
                l.next = (isL1Over?n2:n1);
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
            head1 = new Node(1);
            head1.next = new Node(2);
            head1.next.next = new Node(3);
            head2 = new Node(1);
            head2.next = new Node(2);
            head2.next.next = new Node(3);
            head3= addTwoList(head1,head2).next;
            while(head3!=null){
                System.out.println(head3.data);
                head3 = head3.next;
            }
    }

}
