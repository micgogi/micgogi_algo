public class LC83 {
    static Node root;
    static Node root1;
    static class Node {
        Node next; int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public static void main(String[] args) {
        root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(2);
        root.next.next.next = new Node(3);
        root.next.next.next.next = new Node(4);
        root.next.next.next.next.next = new Node(5);
        int prev_data=root.data;
        Node temp = root.next;
        root1 = new Node(root.data);
        Node temp2 =root1;
        while(temp!=null){
            int new_data=temp.data;
            if(prev_data!=new_data){
               temp2.next = new Node(new_data);
               temp2=temp2.next;
               prev_data = new_data;
            }
            temp = temp.next;
        }
        while(root1!=null){
            System.out.println(root1.data+" ----");
            root1= root1.next;
        }
    }
}
