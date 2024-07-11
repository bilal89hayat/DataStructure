package DataStructure.Tree.BinaryTree;

public class HeightOfTree {

    /*The height of the tree is the number of vertices in the tree from the root to the deepest node.
    Note: The height of an empty tree is 0 and the height of a tree with single node is 1.*/

    public static void main(String[] args) {

        //Create a DataStructure.Tree
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

        System.out.println("depth is : " + findHeight(node) ) ;
    }

    private static int findHeight(Node node) {

        if(node == null){
           return 0;
        }

        int left = findHeight(node.left) + 1;
        int right = findHeight(node.right) + 1;

        return Math.max(left, right);
    }
}
