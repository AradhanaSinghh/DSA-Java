package com.company;
import java.util.*;
public class postOrder_Using_Two_Stacks {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static List<Integer> postOrder(Node root) {
        List<Integer> wrapList = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        if (root == null)
            return wrapList;
        stack1.push(root);
        while (!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.add(root);
            if (root.left != null) {
                stack1.push(root.left);
            }
            if (root.right != null) {
                stack1.push(root.right);
            }
        }while (!stack2.isEmpty()) {
            wrapList.add(stack2.pop().data);
        }
        return wrapList;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        List<Integer> postOrder= new ArrayList<>();
        postOrder=postOrder(root);
        for(int i=0;i<postOrder.size();i++){
            System.out.print(postOrder.get(i)+" ");
        }
    }
}
