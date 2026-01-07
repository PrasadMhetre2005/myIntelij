package DSAbyShraddha.Linked_List;

public class impl_singly_LL {

    static Node Insert_atEnd(Node head,int data){

        Node newNode= new Node(data);
        if(head==null){
            return newNode;

        }
        Node last=head;

        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;

        return head;
    }

    static Node Insert_atBeggining(Node head,int data){

        Node newnode= new Node(data);
        newnode.next=head;
        return newnode;
    }

    static Node Insert_atPos(Node head, int data,int pos){

        if(pos<1){
            return head;
        }
        if(pos==1){
            Node newnode = new Node(data);
            newnode.next=head;
            return newnode;
        }

        Node curr=head;
         for (int i=1;i<pos-1 && curr!=null;i++){
             curr=curr.next;




        }
        if(curr==null){
            return head;
        }

        Node newnode=new Node(data);
        newnode.next=curr.next;
        curr.next=newnode;
        return head;

    }

    static void Transvers_LL(Node head){
        while (head!=null){
            System.out.print(head.data);
            if (head.next!=null){
                System.out.print("-->");

            }
            head=head.next;
        }
        System.out.println("");

    }
    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }


    }
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}



