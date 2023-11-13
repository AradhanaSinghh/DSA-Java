package com.company;
import java.util.*;

public class Stack_Valid_parentheses {
    public static Boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char it:s.toCharArray()){
            if(it=='('||it=='{'||it=='['){
                stack.push(it);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ch=stack.pop();
                if((it=='}' && ch=='{') || (it==']' && ch=='[') || (it==')' && ch=='(')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="()[{}()]";
        if(isValid(s)==true)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
