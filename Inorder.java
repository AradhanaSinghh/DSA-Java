package com.company;
import java.util.*;

public class Inorder {
    public List<Integer> InorderTrav(Node root){
        List<Integer> result =new ArrayList<>();
        inorderTravHelp(root,result);
        return result;
    }
    public static void inorderTravHelp(Node node,List<Integer> res){
        if(node==null){
            return;
        }
        inorderTravHelp(node.left,res);
        res.add(node.data);
        inorderTravHelp(node.right,res);
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

        List<Integer> Inorder=new ArrayList<Integer>();
        inorderTravHelp(root, Inorder);
        for (int i = 0; i < Inorder.size(); i++) {
            System.out.print(Inorder.get(i) + " ");
        }
    }
}
