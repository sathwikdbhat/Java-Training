import java.util.PriorityQueue;
public class KLargestAndKthLargest {
    static void findLargestAndkthLargestElements(int[] arr, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        //1.Insert all elements into the heap
        //2.Remove the elements exceeding the k size
        for(int num:arr)
        {
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        //Print the kth largest
        System.out.println("The kth largest is : "+minheap.peek());
        //Print all the k largest elements one by one
        while(!minheap.isEmpty()){
            System.out.println(minheap.poll()+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {19,21,4,9,3,7};
        int k=3;
        findLargestAndkthLargestElements(arr,k);
    }
}