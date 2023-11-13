package com.company;
import java.util.*;
public class Imp_min_stack {
    public static class MinStack{
        Stack<Long> st=new Stack<>();
        Long mini;
        MinStack(){
            mini=Long.MAX_VALUE;
        }
        public void push(int val){
            Long value=Long.valueOf(val);
            if(st.isEmpty()){
                st.push(value);
                mini=value;
            }else{
                if(value<mini){
                    st.push(2*value-mini);
                }
                else{
                    st.push(value);
                }
            }
        }
        public void pop(){
            if(st.isEmpty()) return;
            Long val=st.pop();
            if(val<mini){
               mini=2*mini-val;
            }
        }
        public int top(){
            Long val=st.peek();
            if(val<mini){
                return mini.intValue();
            }
            return val.intValue();
        }
        public int getMin(){
            return mini.intValue();
        }
    }
    public static void main(String[] args) {

    }
}
