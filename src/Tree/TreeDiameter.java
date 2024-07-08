package Tree;

public class TreeDiameter {

    /*The diameter/width of a tree is defined as the number of nodes on the longest path between two end nodes.*/
    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(10);
        node.right = new Node(15);
        node.left.left = new Node(20);
        node.left.left.left = new Node(75);
        node.left.left.left.right = new Node(80);
        node.left.right = new Node(25);
        node.right.left = new Node(30);
        node.right.right = new Node(35);
        node.right.right.right = new Node(60);
        node.right.right.right.right = new Node(70);
        node.left.right.right = new Node(45);

        int diameter = findDiameter(node);
        System.out.println("Diameter  " + diameter);
    }

    private static int findDiameter(Node node) {

        if(node == null){
          return 0;
        }

        int left = leftHeight(node.left);
        int right = rightHeight(node.right);

        System.out.println("left " + left);
        System.out.println("right " + right);

        return (left + right + 1);
    }

    private static int rightHeight(Node node) {

        if(node == null){
          return 0;
        }

        int lHeight = rightHeight(node.left) + 1;
        int rHeight = rightHeight(node.right) + 1;

        return Math.max(lHeight, rHeight);
    }

    private static int leftHeight(Node node) {

        if(node == null){
            return 0;
        }

        int lHeight = leftHeight(node.left) + 1;
        int rHeight = rightHeight(node.right) + 1;

        return Math.max(lHeight, rHeight);
    }
}
