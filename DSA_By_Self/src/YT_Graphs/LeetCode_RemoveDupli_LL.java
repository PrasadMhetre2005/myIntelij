package YT_Graphs;

import static YT_Graphs.LeetCode_RemoveDupli_LL.Node.delecteDuplicate;

public class LeetCode_RemoveDupli_LL {

    static class Node{

        int data;
        Node next;

        Node(int x){
            this.data=x;
            this.next=null;
        }

        public static Node delecteDuplicate(Node Head){

            Node curr= Head;

            while (curr.next!=null&& curr!=null){

                if (curr.data== curr.next.data){
                    curr.next=curr.next.next;
                }

                else curr=curr.next;

            }
            return Head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original List: 1 -> 1 -> 2 -> 3 -> 3");

        Node result = delecteDuplicate(head);

        System.out.print("After Removing Duplicates: ");
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    
    }
}
