package com.company;
import java.util.*;
public class Stacks_1 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop()); --Empty stack Exception
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek());//not remove from queue
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //Doubly ended queue --you can insert or delete from both the sides
        Deque<Integer> deque=new ArrayDeque<>();//faster than stack and linkedlist
        deque.addFirst(2);
        deque.addLast(2);
        deque.remove(2);
        System.out.println(deque);
    }
}
