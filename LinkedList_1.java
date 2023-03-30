package com.company;

import java.util.*;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
          linkedList.add(sc.nextInt());
        }
       /* linkedList.addFirst(5);
        linkedList.addFirst(7);
        linkedList.addLast(2);
        linkedList.addFirst(0);*/
        System.out.println(linkedList);
        linkedList.forEach(n-> System.out.println(n));
        for(int n : linkedList){
            System.out.print(n);
            System.out.print("->");
        }
        System.out.print("NUll");

       /* Collections.reverse(linkedList);*/
        System.out.println();
        Collections.sort(linkedList);
        for(int n : linkedList){
            System.out.print(n);
            System.out.print("->");
        }
        System.out.print("NUll");



    }
}
