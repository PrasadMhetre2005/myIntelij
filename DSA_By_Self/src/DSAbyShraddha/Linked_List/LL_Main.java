package DSAbyShraddha.Linked_List;

import static DSAbyShraddha.Linked_List.impl_singly_LL.*;

public class LL_Main {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next =new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);


        Insert_atEnd(head,6);
        head=Insert_atBeggining(head,8);
        printList(head);






//        while (head!=null){
//            System.out.print(head.data+" ");
//            head=head.next;
//        }



    }

}
