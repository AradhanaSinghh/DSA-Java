package com.company;
import java.util.*;
public class ImpStackUsingArray {
    public static class stack{
        int size=1000;
        int arr[]=new int[size];
        int top=-1;
        public void push(int x){
            top++;
            arr[top]=x;
        }
        public int top(){
            return arr[top];
        }
        public int pop(){
            int x=arr[top];
            top--;
            return x;
        }
        public int size(){
            return top+1;
        }
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());

    }
}
