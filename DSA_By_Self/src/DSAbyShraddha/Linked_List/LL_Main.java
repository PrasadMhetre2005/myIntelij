package DSAbyShraddha.Linked_List;

import static DSAbyShraddha.Linked_List.Delation_operration_LL.Delate_first_Node;
import static DSAbyShraddha.Linked_List.Delation_operration_LL.Delate_secondlast;
import static DSAbyShraddha.Linked_List.impl_singly_LL.*;

public class LL_Main {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next =new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);


        Insert_atEnd(head,6);
        head=Delate_first_Node(head);
        Insert_atPos(head,67,2);
        Delate_secondlast(head);

        printList(head);







//        while (head!=null){
//            System.out.print(head.data+" ");
//            head=head.next;
//        }



    }

}
