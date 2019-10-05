public class LinekdListLoop {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int detectLoop(){
        Node slowPtr = head;
        Node fastPtr = head;
        while(slowPtr!=null &&fastPtr!=null&&fastPtr.next!=null){

            slowPtr = slowPtr.next ;
            fastPtr= fastPtr.next.next;
            if(slowPtr==fastPtr){
                System.out.println("LOOP DETECTED");
                return 1;
            }

        }
        return 0;

    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head;
        detectLoop();



    }
}
