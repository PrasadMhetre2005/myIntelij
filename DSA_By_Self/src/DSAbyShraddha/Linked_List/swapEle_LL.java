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

    public static void main(String[] args) {

    }




}