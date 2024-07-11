package DataStructure.Tree.BinaryTree;

public class HeightOfNode {

    static int height = -1;

    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.right = new Node(35);
        //node.right.right.right = new Node(60);
        //node.right.right.right.right = new Node(70);
        node.left.right.right = new Node(45);

        findHeight(node, 10);

    }

    private static void findHeight(Node node, int k) {

        findHeightOfNode(node, k);
        System.out.println("height of node : " + height);

    }

    private static int findHeightOfNode(Node node, int k) {

        if(node == null){
          return -1;
        }

        int left = findHeightOfNode(node.left, k) + 1;
        int right = findHeightOfNode(node.right, k) + 1;

        if(node.val == k){
           height = Math.max(left, right);
        }

        return Math.max(left, right);
    }

}
