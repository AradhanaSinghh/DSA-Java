import java.util.*;

public class postOrder {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static List<Integer> postOrder(Node root) {
        List<Integer> postOrder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root); // Push the root node onto the stack

        while (!stack.isEmpty()) {
            Node topNode = stack.pop();
            postOrder.add(0, topNode.data); // Add the data of the current node to the list

            if (topNode.right != null) {
                stack.push(topNode.right);
            }
            if (topNode.left != null) {
                stack.push(topNode.left);
            }
        }
        return postOrder;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(4);

        List<Integer> postOrder = postOrder(root);
        for (int i = 0; i < postOrder.size(); i++) {
            System.out.print(postOrder.get(i) + " ");
        }
    }
}
