package DSAbyShraddha.Linked_List;

public class GFG_FindMiddle {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getMiddle(Node head){

        Node fast=head;
        Node slow=head;

        while (fast!=null&&fast.next==null){

            fast=fast.next.next;
            slow=slow.next;

        }

        return slow.data;





    }




    public static void main(String[] args) {

    }
}
