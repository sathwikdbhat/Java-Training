class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class FloydsCycleDetection {
    static Node head=null;
    static void createList(){
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);  // Creating a cycle
        head.next.next.next.next=head.next;
    }

    static boolean hasCycle(){
        Node slow=head;
        Node fast=head;
        while (fast !=null && fast.next !=null){
            slow=slow.next;  // Move 1 step
            fast=fast.next.next; // Move 2 step
            if (slow==fast)
                return true;  // Detected a Cycle.
        }
        return false;  // No cycle has been detected.
    }
    public static void main(String[] args) {
        createList();
        if(hasCycle())
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle");

        // System.out.println(hasCycle() ? "Cycle Detected" : "No Cycle");
    }
}