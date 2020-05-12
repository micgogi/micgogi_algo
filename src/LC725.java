/**
 * @author Micgogi
 * on 5/11/2020  9:12 PM
 * Rahul Gogyani
 */
public class LC725 {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;

        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int k = 5;
        int size = size(head);
        int blockSize = Math.max(1,size/k);
        int rem = k>size?0:size%k;
        Node list[] = new Node[k];
        int j=0;
        while(head!=null){
            Node start = head;
            Node end = start;
            for(int i=1;i<=blockSize+(rem>0?1:0);i++){
                end = head;
                head  = head.next;
            }
            if(end!=null){
                end.next = null;
            }
            rem--;
            list[j++]=start;
        }

    }

    static int size(Node head){
        int size =0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }

}
