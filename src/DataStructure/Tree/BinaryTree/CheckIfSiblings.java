package DataStructure.Tree.BinaryTree;

public class CheckIfSiblings {

    public static void main(String[] args) {

        //Two nodes are siblings if they have a common parent

        Node node = new Node(5);
        node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.right = new Node(25);
        /*
        node.right.left = new Node(30);
        node.right.right = new Node(35);
        node.right.right.right = new Node(60);
        node.right.right.right.right = new Node(70);
        node.left.right.right = new Node(45);
        */

        System.out.println(ifSiblings(node, 10, 25));
    }

    private static boolean ifSiblings(Node node, int k, int j) {

     if(node == null){
       return false;
     }

     if(node.left.val == k && node.right.val == j){
     return true;
     }

     ifSiblings(node.left, k, j);
     ifSiblings(node.right, k, j);

     return false;
    }
}
