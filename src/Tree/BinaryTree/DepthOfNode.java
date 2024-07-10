package Tree.BinaryTree;

public class DepthOfNode {


    public static void main(String[] args) {

        //Create a Tree
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

        System.out.println("depth is : " + findDepth(node, 70) ) ;
    }

    private static int findDepth(Node node, int k) {

        int depth = -1;

        if(node == null){
          return -1;
        }
        if(node.val == k){
           return depth + 1;
        }

        depth = findDepth(node.left, k);
        if(depth >= 0){
            return depth +1;
        }

        depth = findDepth(node.right, k);
        if(depth >= 0){
           return depth +1;
        }

        return depth;
    }
}
