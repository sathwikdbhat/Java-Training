import java.util.PriorityQueue;
import java.util.Queue;
public class EmergencyRoomL1 {
    public static void main(String[] args) {
        Queue<Integer> severity=new PriorityQueue<>();
        // 1 --> High Priority
        // 2 --> Low Priority
        // 3 --> Medium Priority
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("The Patient that gets operated first is Patient"+severity.poll());
        System.out.println("Patient in Queue: "+severity);
    }
}