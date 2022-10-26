public class InOderIN_BST {

    Node root;
    InOderIN_BST(){
        root = null;
    }


    public static void main(String[] args) {
        InOderIN_BST tree = new InOderIN_BST();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("InOder Traversal of BST");
        tree.inOrder();
    }

    private void inOrder() {
        inOderInBST(root);
    }

    private void inOderInBST(Node node) {
        if(node == null){
            return;
        }

        inOderInBST(node.left);
        System.out.print(node.key +" ");
        inOderInBST(node.right);
    }


}

class Node{
    int key;
    Node left, right;
    Node(int item){
        key = item;
        left = null;
        right = null;
    }
}