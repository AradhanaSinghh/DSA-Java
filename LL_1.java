package com.company;

public class LL_1 <T>{

       T data;
        LL_1 <T> head;
       LL_1 <T> next;
       public LL_1(T data){
           this.data=data;
           this.next=null;
       }

    public static void printList1(LL_1 head){
        if(head==null){
            System.out.println("List is empty!");
        }
        LL_1 currnode=head;
        while(currnode != null) {
            System.out.print(currnode.data+ " -> ");
            currnode =currnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LL_1<Integer> node1=new LL_1<>(3);
        LL_1<Integer> node2=new LL_1<>(4);
        LL_1<Integer> node3=new LL_1<>(5);

        node1.next=node2;
        node2.next=node3;
        printList1(node1);
    }
}
