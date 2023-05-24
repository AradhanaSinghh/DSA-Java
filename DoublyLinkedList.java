package com.company;

public class DoublyLinkedList {
    private Node head;
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertLast(int val){
        Node newNode=new Node(val);
        Node last=head;
        newNode.next=null;
        if(head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        newNode.prev=last;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert_position(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("p doesn't exist!");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    public void display() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.print("end");
        System.out.println();
        System.out.println("reverse");
            Node last =head;
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
            System.out.print("start");
    }
        public static void main(String[] args) {
            DoublyLinkedList list=new DoublyLinkedList();
            list.insertFirst(5);
            list.insertFirst(58);
            list.insertFirst(584);
            list.insert_position(5,54);
            list.display();
        }
}
