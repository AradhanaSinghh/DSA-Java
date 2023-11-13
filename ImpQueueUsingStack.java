package com.company;
import java.util.*;
public class ImpQueueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> input=new Stack<>();
        Stack<Integer> output=new Stack<>();
        class myQueue{
           public void push(int x){
               input.push(x);
           }
           public int pop(){
               if(output.isEmpty()){
                   while(!input.isEmpty()){
                       output.push(input.peek());
                       input.pop();
                   }
               }
               int y= output.peek();
               output.pop();
               return y;
           }
           public int peek(){
               if(output.isEmpty()){
                   while(!input.isEmpty()){
                       output.push(input.peek());
                       input.pop();
                   }
               }
               int y= output.peek();
               return y;
           }
           public int size(){
               return output.size();
           }
        }
    }
}
