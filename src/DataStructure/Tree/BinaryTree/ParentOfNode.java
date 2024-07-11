package DataStructure.Tree.BinaryTree;

public class ParentOfNode {

    static int parent;
    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.left.left = new Node(40);
        node.right.right = new Node(35);
        node.right.right.right = new Node(60);
        node.right.right.right.right = new Node(70);
        node.left.right.right = new Node(45);

        findParent(node, 45);
        System.out.println("parent is : " + parent);
    }

    private static void findParent(Node node, int k) {

        postOrder(node, k);
    }

    private static boolean postOrder(Node node, int k) {

        if(node == null){
            return false;
        }

        boolean flag_1 = postOrder(node.left, k);
        if (flag_1){
            parent = node.val;
        }
        boolean flag_2 = postOrder(node.right, k);
        if (flag_2){
            parent = node.val;
        }

        if(node.val == k){
           return true;
        }
        return false;
    }
}
