/**
 * @author Micgogi
 * on 7/10/2020  5:37 PM
 * Rahul Gogyani
 */
public class LC234 {
    static Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(2);
//        head.next.next.next = new Node(3);
        Node temp = head;
        Node temp2= head;
        int n=0;
       rev(temp);
        System.out.println(count);
        int size =0;

        while (temp2!=null){
            size++;
            temp2 = temp2.next;
        }
        System.out.println(size);
        if(size==count){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
    static int count =0;
    public static void rev(Node temp){
        if(temp!=null){
            rev(temp.next);

            if(temp.data==head.data){
                head=head.next;
                count++;
            }


        }

    }


}
