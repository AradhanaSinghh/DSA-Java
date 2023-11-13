package com.company;
import java.util.*;

class StockSpan{
    private Stack<Integer> prices;
    private Stack<Integer> spans;
    public StockSpan(){
        prices=new Stack<>();
        spans=new Stack<>();
    }
    public int next(int price){
        int span=1;
        while(!prices.isEmpty() && price>=prices.peek()){
            span+=spans.peek();
            prices.pop();
        }
        prices.push(price);
        spans.push(span);
        return span;
    }
}
public class Stack_Online_Stock_span {
    public static void main(String[] args) {

    }
}
