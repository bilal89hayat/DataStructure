package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertUsingLevelOrder {

    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.right = new Node(35);

        insertUsingLevelOrder(node, 45);
        printLevelOrder(node);

    }

    private static void printLevelOrder(Node node) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){

            Node tempNode = queue.poll();
            System.out.println(tempNode.val);

            if(tempNode.left != null){
               queue.add(tempNode.left);
            }

            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }

    private static void insertUsingLevelOrder(Node node, int i) {

        if(node == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){

            Node tempNode = queue.poll();

            if(tempNode.left == null){
                tempNode.left = new Node(i);
                return;
            }
            else {
                queue.add(tempNode.left);
            }

            if(tempNode.right == null){
                tempNode.right = new Node(i);
                return;
            }
            else {
                queue.add(tempNode.right);
            }
        }
    }


}
