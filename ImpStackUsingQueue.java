package com.company;
import java.util.*;

public class ImpStackUsingQueue {
    class stack{
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        void push(int x){
             q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.peek());
                q2.remove();
            }
            Queue<Integer> q=q1;
            q1=q2;
            q2=q;
        }
        public Boolean isEmpty(){
            return q2.isEmpty();
        }
        public int top(){
            if(!q2.isEmpty()){
                return -1;
            }
            return q2.peek();
        }
        public int pop(){
            if(!q2.isEmpty()){
                return -1;
            }
            return q2.remove();
        }
    }
    public static void main(String[] args) {

    }
}
