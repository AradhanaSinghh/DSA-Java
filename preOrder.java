package com.company;

import java.util.ArrayList;
import java.util.Stack;


public class preOrder{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static ArrayList<Integer> preOrderTrav(Node root){
        ArrayList<Integer> preOrder=new ArrayList<Integer>();
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node topNode=s.peek();
            preOrder.add(topNode.data);
            s.pop();
            if(topNode.right!=null){
                s.push(topNode.right);
            }
            if(topNode.left!=null){
                s.push(topNode.left);
            }
        }
        return preOrder;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(3);
        root.right=new Node(4);
        ArrayList<Integer> preOrder=new ArrayList<Integer>();
        preOrder=preOrderTrav(root);
        for(int i=0;i<preOrder.size();i++){
            System.out.print(preOrder.get(i)+" ");
        }
    }
}
