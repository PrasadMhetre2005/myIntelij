package DSAbyShraddha.Linked_List;

import DSAbyShraddha.Arrays.MergeTwoLists;


class Solution {
    public Node swapNodes(Node head, int k) {

        Node fast= head;
        Node slow=head;

        for(int i=0; i<k;i++){
            fast= fast.next;

        }


        while(fast!=null){

            fast=fast.next;
            slow=slow.next;


        }
        fast=head;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }

        int temp= fast.data;
        fast.data=slow.data;
        slow.data=temp;


        return head;



    }

    public static boolean DetectLoop(Node head){

        Node slow= head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    public Node mergeTwoLists(Node list1, Node list2){


        Node head= new Node();

        Node tail = head;

        while(list1!=null&& list2!=null){

            if(list1.data<list2.data){

                tail.next=new Node(list1.data);
                list1=list1.next;
            }
            else{
                tail.next=new Node(list2.data);
                list2=list2.next;
            }
            tail=tail.next;
        }

        if (list1==null){
            tail.next=list2;
        }
        if(list2==null){
            tail.next=list1;
        }

        return head.next;
    }

    public static void main(String[] args) {

    }




}