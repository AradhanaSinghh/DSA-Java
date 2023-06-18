package com.company;

import java.util.*;
public class LevelOrder{
 public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
    public static List<List<Integer>> levelOrderTrav(Node root) {
        List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueLevels = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < queueLevels; i++) {
                Node node = queue.poll();
                levelList.add(node.data);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            wrapList.add(levelList);
        }
        return wrapList;
    }
    public List<Integer> levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        List<Integer> wrapList = new ArrayList<Integer>();

        if (root == null) return wrapList;
        queue.offer(root);
        while (!queue.isEmpty()) {
            if (queue.peek().left != null)
                queue.offer(queue.peek().left);
            if (queue.peek().right != null)
                queue.offer(queue.peek().right);
            wrapList.add(queue.poll().data);
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
        List<List<Integer>> wrapList =levelOrderTrav(root);;
        for (List<Integer> levelList : wrapList) {
            for (int i = 0; i < levelList.size(); i++) {
                System.out.print(levelList.get(i));

                // Add a separator between elements except for the last element
                if (i < levelList.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
