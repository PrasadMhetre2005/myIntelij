package DSAbyShraddha.Linked_List;
import static DSAbyShraddha.Linked_List.impl_singly_LL.*;



public class Delation_operration_LL {

    static Node Delate_first_Node(Node head){
        if(head==null){
            return null;
        }

        Node temp=head;
        head=head.next;

        temp=null;

        return head;


    }
    static Node Delate_secondlast(Node head){
        if(head==null){
            return null;
        }

        if(head.next==null){
            return null;
        }

        Node currNode=head;

        while(currNode.next.next!=null){
            currNode=currNode.next;

        }
        currNode.next=null;

        return head;

    }

}
