public class TreeNode {
    int data;  // The data of the node.
    TreeNode left;  // The reference to the left child.
    TreeNode right;  // the reference to the right child.

    public TreeNode(int data) {
        this.data=data;
        this.left=this.right=null;  // Initially the node has no children
    }

    public static void preorder(TreeNode root){  // DLR
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void inorder(TreeNode root){  // LDR
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void postorder(TreeNode root){  // LRD
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        //The rules for constructing the binary tree -> top to bottom and left to right
        //level 0
        TreeNode root = new TreeNode(1);
        //level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();
    }
}