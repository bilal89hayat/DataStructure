package Tree.BinaryTree;

public class FindSiblings {

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

        findSiblings(node);

    }

    private static Node findSiblings(Node node) {

      if(node == null){
         return null;
      }

      Node left = findSiblings(node.left);
      Node right = findSiblings(node.right);

      if(left!=null && right!=null){
          System.out.println("siblings : " +  left.val + " " + right.val);
      }
      return node;
    }
}
