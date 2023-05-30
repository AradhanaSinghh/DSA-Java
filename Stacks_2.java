package com.company;
class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    CustomStack(){
        this(DEFAULT_SIZE);//by default pass the constructor size 10
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int peek() throws StackException{
        if (isEmpty()) {
            throw new StackException("can't peek from empty stack");
        }
        return data[ptr--];
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[ptr--];
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }
    public boolean isEmpty() {
        return ptr==-1;
    }
}
class StackException extends Exception{
    public StackException(String message){
        super(message);
    }
}
public class Stacks_2 {
    public static void main(String[] args) throws StackException{
        CustomStack stack=new CustomStack(5);
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
        System.out.println(stack.pop());
    }
}
