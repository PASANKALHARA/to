public class Tree {
    Node root;

    Tree() {
        root = null;
    }

    void addNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            insertRec(root, newNode);
        }
    }

    void insertRec(Node node, Node newNode) {
        if (newNode.data < node.data) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertRec(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertRec(node.right, newNode);
            }
        }
    }

    Node findNode(int data) {
        return findNodeRec(root, data);
    }

    Node findNodeRec(Node node, int data) {
        if (node == null || node.data == data) {
            return node;
        }

        if (data < node.data) {
            return findNodeRec(node.left, data);
        } else {
            return findNodeRec(node.right, data);
        }
    }

    void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    void preOrderRec(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.data + " ");
        }
    }

    void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }

    

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(77);
        tree.addNode(63);
        tree.addNode(47);
        tree.addNode(7);
        tree.addNode(92);
        tree.addNode(27);
        tree.addNode(13);

        

        Node node = tree.findNode(7);
        if (node != null) {
            System.out.println("Found node: " + node.data);
        } else {
            System.out.println("Node not found");
        }
		
		System.out.println("Pre-order traversal:");
        tree.preOrder();

        System.out.println("Post-order traversal:");
        tree.postOrder();

        System.out.println("In-order traversal:");
        tree.inOrder();
    }
}
