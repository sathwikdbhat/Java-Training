class  LL {
    Node head;
    private int size;

    LL() {
        size=0;
    }

    public class Node {
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;  // We don't know the address of the next node.
            size++;  // Increment the size as soon as a node is created.
        }
    }

    public void printList() {
        Node curr=head;
        while (curr  != null) {
            System.out.print(curr.data +"  --->  ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public void addFirst(String data){
        // Create a new node
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        // Create a new node
        Node newNode=new Node(data);
        // Empty List
        if (head==null){
            head=newNode;
            return;
        }
        // If there are multiple nodes, we need to find the last node.
        Node last=head;
        while (last.next != null){
            last=last.next;
        }
        // At the end of this loop, we will stand at the last node. So, Point the last node next pointer to the new node.
        last.next=newNode;
    }

    public void removeFirst(){
        // Empty list --> cannot remove the head node.
        if (head==null){
            System.out.println("List is Empty. Can't delete the head.");
            return;
        }
        // For a single node, the head will point to the next(null).
        // For multiple nodes, the head will point to the next (head.next)
        head=this.head.next;
    }

    public void removeLast(){
        if (head==null){
            System.out.println("List is Empty. Can't delete the tail.");
            return;
        }
        // To remove Single Element in the list
        if (head.next==null){
            head=null;
            size--;  // C/C++ style of code
            return;
        }
        // To remove Multiple Elements in the list
        Node curr=head;
        Node last=head.next;
        while (last.next !=null){
            curr=last;
            last=last.next;
        }
        // The last node will be declared by the JVM if not used. So, we point the secondLast (curr) node to null pointer.
        curr.next=null;
        size--;
    }

    public void removeTarget(String target){
        // Empty list --> cannot remove the target node.
        if (head==null){
            System.out.println("List is empty. Can't delete the target");
            return;
        }
        //Case: Target is the head node itself
        if (head.data.equals(target)){
            head=head.next;
            size--;
            return;
        }
        // Case: Target is anywhere in the list
        Node prev=null;
        Node curr=head;
        while (curr != null && !curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        // Do a check to see if the curr pointer is null. If its null, then target is not found.
        if (curr==null){
            System.out.println("Not found");
            return;
        }
        prev.next=curr.next;
        size--;
    }

    public static void main(String[] args) {
        LL sll=new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("We");
        sll.printList();

        System.out.println("\n");
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();

        System.out.println("\n");
        sll.removeFirst();
        sll.printList();

        System.out.println("\n");
        sll.removeLast();
        sll.printList();

        System.out.println("\n");
        sll.removeTarget("Learning");
        sll.printList();
        sll.removeTarget("python");
        sll.printList();
    }
}