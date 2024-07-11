package DataStructure.Tree.BinaryTree.Traversal.Bfs;

import DataStructure.Tree.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueue {

    /**
     *Using Queue
     */
    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.right = new Node(35);
        node.right.right.right = new Node(60);
        node.right.right.right.right = new Node(70);
        node.left.right.right = new Node(45);

        levelOrder(node);
    }

    private static void levelOrder(Node node) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){

            Node tempNode = queue.poll();
            System.out.println(tempNode.val);

            if(tempNode.left !=null){
              queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }
}
