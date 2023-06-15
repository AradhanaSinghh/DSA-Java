package com.company;
import java.util.*;
public class preOrder_rec {
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
        if(node==null){
            return;
        }
       result.add(node.data);
        helpPreOrder(node.left,result);
        helpPreOrder(node.right,result);
    }

    public static void main(String[] args) {
        Node root=new Node(7);
        root.left=new Node(8);
        root.right=new Node(9);
        root.right.left=new Node(10);
        List<Integer> preOrder=new ArrayList<>();
        helpPreOrder(root,preOrder);
        for(int i=0;i<preOrder.size();i++){
            System.out.print(preOrder.get(i)+" ");
        }
    }
}
