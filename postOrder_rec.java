package com.company;
import java.util.*;
public class postOrder_rec {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static List<Integer> preOrder(Node root){
        List<Integer> result=new ArrayList<>();
        helpPreOrder(root,result);
        return result;
    }

    private static void helpPreOrder(Node node, List<Integer> result) {
        if(node==null) {
            return;
        }
        helpPreOrder(node.left,result);
        helpPreOrder(node.right,result);
        result.add(node.data);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        List<Integer> postOrder=new ArrayList<>();
        helpPreOrder(root,postOrder);
        for(int i=0;i<postOrder.size();i++){
            System.out.print(postOrder.get(i)+" ");
        }
    }
}
