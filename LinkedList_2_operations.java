package com.company;

//java me destructor nhi likhte wh pehle se hi hota hai
// java garbage collector inbuilt hota hai

import java.util.Scanner;

public class LinkedList_2_operations{
    private int size=0;
    Node head;
    class Node{

        int  data;
        Node next;

        Node(int data) {
            this.data=data;
            this.next=null;
            size++;

        }
    }
    public void addFirst(int data){

        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void add_position(int data,int position){
        Node newNode = new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        for(int i=0;i<position-2;i++){
           temp= temp.next;
        }
        newNode.data=data;
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public void addLast(int data){

        Node newNode = new Node(data);
        if(head==null)
        {

            head=newNode;
            return;

        }
        Node  currnode=head;
        while(currnode.next != null) {
            currnode =currnode.next;
        }
        currnode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty!");
        }
        Node  currnode=head;
        while(currnode != null) {
            System.out.print(currnode.data+ " -> ");
            currnode =currnode.next;
        }
        System.out.println("NULL");
    }
    //deletion
    public void deleteFirst() {

        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        head=head.next;
        size--;
    }
    public void delete_position(int position){
        size--;
        // If linked list is empty
        if (head == null)
            return;
        // Store head node
        Node temp = head;
        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position -2 ; i++)
            temp = temp.next;
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;


        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
        System.out.println(next.data);
        temp.next = next; // Unlink the deleted node from list
    }
    public  void deleteLast(){
        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        size--;
        if(head.next ==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode =head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void getSize() {
        System.out.println(size);
    }
    //optimal approach:-
    /*
    time comp.=O(N/2)
    space comp.=O(1)
     */
    public void middle_element(){
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public void delete_middle_element(){
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next ==null){
            head.next=null;
            return;
        }
        slow.data=slow.next.data;
        slow.next= slow.next.next;
    }

    public static void main(String[] args) {
        LinkedList_2_operations list = new LinkedList_2_operations();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.deleteLast();
 /*       list.printList();
        list.getSize();*/
      /*  list.printList();
        list.add_position(5, 1);
        list.printList();
        list.delete_position(5, 1);
        list.printList();
        list.getSize();*/
//        list.middle_element();
        list.printList();

    }
}
