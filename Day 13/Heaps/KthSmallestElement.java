import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElement {
    public static void kthSmallestElement(int arr[], int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 1. Insert all elements into the heap
        // 2. Remove the elements exceeding the k size

        for(int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove smallest if size > k
            }
        }
        // After the operation the top element will be the kth smallest
        System.out.println("Kth smallest in the array: "+Arrays.toString(arr)+" is "+maxHeap.peek());
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 1, 3, 0};
        int k = 3;
        kthSmallestElement(arr, k); 
    }
}