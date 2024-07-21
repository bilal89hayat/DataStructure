package DataStructure.Tree.BinaryTree;

import DataStructure.Tree.Node;

public class SumOfAllNodes {

    public static int sum = 0;

    public static void main(String[] args) {

        Node root1 = new Node(10);
        root1.right = new Node(6);
        root1.left = new Node(4);
        root1.left.right = new Node(30);
        root1.left.left = null;
        root1.right.left = new Node(7);

        System.out.println("sum is : " + sum(root1));
    }

    private static int sum(Node node) {

        if (node == null){
            return 0;
        }


        int left = sum(node.left);
        int right = sum(node.right);

        return left + right + node.val;
    }
}
