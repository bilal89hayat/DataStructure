package DataStructure.Tree.BinaryTree.Traversal;

import DataStructure.Tree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseLevelOrderWithoutStack {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();

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

        int height = height(node);
        for (int i = height; i >= 1 ; i--) {
            List<Integer> list = new ArrayList<>();
            reverseLevel(node, i, list);
            //reverseLevel(node, i);
            lists.add(list);
        }

        System.out.println(lists);
    }

    private static void reverseLevel(Node node, int height, List<Integer> list) {

        if (node == null){
            return;
        }

        if (height == 1){
            list.add(node.val);
        }

        if (height > 1){
            reverseLevel(node.left, height-1, list);
            reverseLevel(node.right, height-1, list);
        }
    }


    private static int height(Node node) {

        if(node == null){
            return 0;
        }
        int lHeight = height(node.left) + 1;
        int rHeight = height(node.right) + 1;
        return Math.max(lHeight, rHeight);
    }


}
