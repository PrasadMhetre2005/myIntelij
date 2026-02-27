package DSAbyShraddha.Linked_List;


import com.sun.net.httpserver.Headers;

import java.util.List;
import java.util.Stack;

public class GFG_All_operations {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }



        static void InsrertAtTai(int value){

        }

        static void Display_LL(Node head){
            Node curr=head;
            while (curr!=null){
                System.out.print(curr.data+ "  ");
                curr=curr.next;

            }
            System.out.println();
        }

        static void Display_Rec(Node head){
            if (head==null) return;
            System.out.print(head.data+"  ");
            Display_Rec(head.next);
        }

        static int get(Node head,int idx){

            Node Temp= head;
            for (int i=0;i<=idx;idx++){
                Temp=Temp.next;
            }
            return Temp.data;
        }


    }

    static class LL_Data_Stucture{

        Node head;
        Node tail;
        void AddAtTail(int data){
            Node temp= new Node(data);
            if (tail==null) head=tail=temp;
            else {tail.next=temp; tail=temp;}


        }
    }

    public static void main(String[] args) {
        Node head= new Node(23);
        Node b= new Node(23);
        Node c= new Node(24);
        Node d= new Node(25);
        Node e= new Node(26);

        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node.Display_LL(head);
        Node.Display_Rec(head);

        LL_Data_Stucture list= new LL_Data_Stucture();
        list.AddAtTail(10);
        list.AddAtTail(20);


    }
}
