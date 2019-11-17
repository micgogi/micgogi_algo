public class LC2 {
    static  Node head1;
    static  Node head2;
    static  Node head3;
    static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void rev(Node temp){
        if(temp!=null){

            rev(temp.next);
            System.out.print(temp.data);
        }
    }
    public static void main(String[] args) {
        head1 = new Node(2);
        head1.next =  new Node(4);
        head1.next.next = new Node(3);
        head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);
       String s1 ="";
       String s2 = "";
       while(head1!=null){
           s1=s1+""+head1.data;
           head1= head1.next;
       }
       while(head2!=null){
           s2=s2+""+head2.data;
           head2= head2.next;
       }
        int t =Integer.parseInt(s1)+Integer.parseInt(s2);
       StringBuilder s3 = new StringBuilder(String.valueOf(t));




       head3 = new Node(Integer.parseInt(""+s3.charAt(0)));
       Node temp = head3;

        for (int i = 1; i <s3.length() ; i++) {
            temp.next= new Node(Integer.parseInt(""+s3.charAt(i)));
            temp= temp.next;
        }

      while(head3!=null){
          System.out.print(head3.data);
          head3= head3.next;
      }


    }
}
