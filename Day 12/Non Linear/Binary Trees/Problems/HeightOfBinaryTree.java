class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class HeightOfBinaryTree {
    static int heightofbinaryTree(Node root){
        // Base Class --> if the root is null,tree is empty
        if(root==null)
        {
            return 0;
        }
        int leftheight=heightofbinaryTree(root.right);
        int rightheight=heightofbinaryTree(root.left);
        return Math.max(leftheight,rightheight)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        System.out.print("Height of 1st tree: "+heightofbinaryTree(root));
        Node root1=null;
        System.out.print("\nHeight of 2nd tree: "+heightofbinaryTree(root1));
    }
}