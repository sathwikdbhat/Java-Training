public class GenericTrees<X> {
    private final X data;
    private GenericTrees<X> left;
    private GenericTrees<X> right;

    public GenericTrees(X data){
        this.data = data;
        this.left = this.right = null;
    }
    void preorder(){
        System.out.print(this.data+" ");
        if(this.left!=null) this.left.preorder();
        if(this.right!=null) this.right.preorder();
    }
    void inorder(){
        if(this.left!=null) this.left.inorder();
        System.out.print(this.data+" ");
        if(this.right!=null) this.right.inorder();
    }
    void postorder(){
        if(this.left!=null) this.left.postorder();
        if(this.right!=null) this.right.postorder();
        System.out.print(this.data+" ");
    }

    public static void main(String[] args) {
        // This is a tree of Integers
        GenericTrees<Integer> integerRoot = new GenericTrees<>(1);
        integerRoot.left = new GenericTrees<>(2);
        integerRoot.right = new GenericTrees<>(3);

        System.out.print("Preorder Integer Tree ");
        integerRoot.preorder();
        System.out.println();
        System.out.print("Inorder Integer Tree: ");
        integerRoot.inorder();
        System.out.println();
        System.out.print("Postorder Integer Tree: ");
        integerRoot.postorder();
        System.out.println();
        System.out.println();

        //This is a tree of Floats
        GenericTrees<Float> floatRoot = new GenericTrees<>(1.2f);
        floatRoot.left = new GenericTrees<>(2.4f);
        floatRoot.right = new GenericTrees<>(4.6f);

        System.out.print("Preorder Float tree: ");
        floatRoot.preorder();
        System.out.println();
        System.out.print("Inorder Float Tree: ");
        floatRoot.inorder();
        System.out.println();
        System.out.print("Postorder Float Tree: ");
        floatRoot.postorder();
        System.out.println();
        System.out.println();

        //This is a tree of Boolean
        GenericTrees<Boolean> booleanRoot = new GenericTrees<>(true);
        booleanRoot.left = new GenericTrees<>(false);
        booleanRoot.right = new GenericTrees<>(true);

        System.out.print("Preorder Boolean Tree: ");
        booleanRoot.preorder();
        System.out.println();
        System.out.print("Inorder Boolean Tree: ");
        booleanRoot.inorder();
        System.out.println();
        System.out.print("Postorder Boolean Tree: ");
        booleanRoot.postorder();
        System.out.println();
        System.out.println();
    }
}