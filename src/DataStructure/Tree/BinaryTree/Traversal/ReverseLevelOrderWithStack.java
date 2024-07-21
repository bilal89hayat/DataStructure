package DataStructure.Tree.BinaryTree.Traversal;

import DataStructure.Tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

    static Stack<Node> stack = new Stack<>();

    public static void main(String[] args) {

        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(2);

        /*node.left.left = new Node(20);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.right = new Node(35);
        node.left.right.right = new Node(45);*/

        int height = heightOfNode(node);


        for (int i = 0 ; i <= height ; i++){
            reverseLevelOrder(node, i);
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop().val);
        }
    }

    private static int heightOfNode(Node node) {

        if(node == null){
           return -1;
        }

        int left = heightOfNode(node.left);
        int right = heightOfNode(node.right);

        return Math.max(left,right)+1;
    }

    private static Node reverseLevelOrder(Node node, int level) {

        if (node == null) {
            return null;
        }

        if (level == 0){
            stack.add(node);
        }

        if(level > 0){
           reverseLevelOrder(node.right, level - 1);
           reverseLevelOrder(node.left, level-1);
        }

        return node;
    }
}

