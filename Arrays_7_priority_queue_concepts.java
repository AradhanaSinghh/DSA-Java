package com.company;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class Arrays_7_priority_queue_concepts {
    static int i=1;
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(50);
        priorityQueue.add(500);
        priorityQueue.add(5000);
        System.out.println(priorityQueue);
        priorityQueue.add(40);
        System.out.println(priorityQueue.peek());//peek retrieves the element and not remove it from priority queue

        Object[] arr = priorityQueue.toArray();

        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j]+" ");
//        System.out.println(priorityQueue.poll());
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Add String object to queue
        queue.add("Aman");
        queue.add("Amar");
        queue.add("Sanjeet");
        queue.add("Josh");
        queue.add("Ron");
        queue.add("Kevin");
        Spliterator<String> spt = queue.spliterator();
       /* spt.forEachRemaining((n->  System.out.println(n)));*/
        while(spt.tryAdvance((n)->System.out.println(i++ +" Name - "+n)));
    }
}
