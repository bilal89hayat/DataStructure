package DataStructure.Tree.BinaryTree;

public class FindAllLeafNodes {

    public static void main(String[] args) {

        Node node = new Node(5);
        /*node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.left.left = new Node(75);
        node.left.left.left.right = new Node(80);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.right = new Node(35);
        node.right.right.right = new Node(60);
        node.right.right.right.right = new Node(70);
        node.left.right.right = new Node(45);*/

        node.left = new Node(10);
        node.right = new Node(20);
        node.left.right = new Node(15);
        node.right.left = new Node(25);
        node.right.right = new Node(30);
        node.right.right.right = new Node(50);
        node.right.right.left = new Node(45);

        findLeafNodes(node);
    }

    private static Node findLeafNodes(Node node) {

        if(node == null){
            return null;
        }

        Node left = findLeafNodes(node.left);
        Node right = findLeafNodes(node.right);

        if(left == null && right == null){
            System.out.println(node.val);
        }
        return node;
    }
}
