package com.company;
import java.util.Spliterator;
import java.util.PriorityQueue;
public class Arrays_8_Spliterator {
    static void print(int s){
        System.out.print("Num: "+s+" ");
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(50);
        priorityQueue.add(500);
        priorityQueue.add(5000);
        Spliterator<Integer> int_split = priorityQueue.spliterator();
        int_split.forEachRemaining((n -> print(n)));
    }
}
