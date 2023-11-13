package com.company;

public class ImpQueueUsingArray {
    public static class Queue {
        private int arr[];
        private int start, end, currSize, maxSize;
        Queue() {
            arr = new int[16];
            start = -1;
            end = -1;
            currSize = 0;
        }
        Queue(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            start = -1;
            end = -1;
            currSize = 0;
        }
        public boolean isfull() {
            return end == maxSize - 1;
        }

        public boolean isEmpty() {
            return end == 0;
        }

        public void push(int newElement) throws Exception {
            if (isfull()) {
                throw new Exception("Queue is full");
            }
            if (end == -1) {
                start = 0;
                end = 0;
            } else {
                end = (end + 1) % maxSize;
            }
            arr[end] = newElement;
            System.out.println("element inserted: " + newElement);
            currSize++;
        }
        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("queue is Empty");
            }
            int popped = arr[start];
            if (currSize == 1) {
                start = -1;
                end = -1;
            } else {
                start = (start + 1) % maxSize;
            }
            currSize--;
            return popped;
        }
        public int top() throws Exception {
            if (isEmpty()) {
                throw new Exception("queue is Empty");
            }
            return arr[start];
        }
        public int size(){
            return currSize;
        }
    }
    public static void main(String[] args) throws Exception{
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
