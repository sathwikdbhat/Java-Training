import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data; // The data of the node
    TreeNode left; //The reference to the left child
    TreeNode right; // The reference to the right child
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null; // Initially the node has no children
    }
}
public class BinaryTree {
    public static void levelOrderTraversalOfBFS(TreeNode root){
        //Base case // Corner case //Edge case
        if(root==null){
            return;
        }
        //you are pushing nodes into the queue, not integers
        Queue<TreeNode> queue=new LinkedList<>();
        // Add the root node into the queue and then traverse left and right
        queue.add(root);
        //print all nodes level by level till queue is empty
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll(); // removes and stores the front node
            System.out.print(temp.data+" ");
            // Left Subtree
            if(temp.left !=null){
                queue.add(temp.left);
            }
            // Right Subtree
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //L0
        TreeNode root=new TreeNode(1);
        //L1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        //L2
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.print("BFS or level order traversal: ");
        levelOrderTraversalOfBFS(root);
    }
}