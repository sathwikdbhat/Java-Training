import java.util.Scanner;
public class SegmentTrees {
    private static final int MAX_SIZE=10005; // Maximum size of the
    private static int[] a=new int[MAX_SIZE];  // Input Array
    private static int[] seg=new int[4*MAX_SIZE];  // Segment Tree
    // F=Function to build the segment tree
    private static void build(int ind, int low, int high){
        if (low==high){
            seg[ind]=a[low];  // Leaf node will have a single element.
            return;
        }
        int mid=(low+high)/2;
        build (2*ind+1,low,mid);  // Build Left Child
        build (2*ind+2,mid+1,high);  // Build Right 
        seg[ind]=Math.max(seg[2*ind+1],seg[2*ind+2]);  // Store the 
    }
    //Function to query the maximum in a given range [l,n]
    private static int query(int ind, int low, int high, int l, int r){
        if (low>=1 && high<=r){  // Completely Overlap
            return seg[ind];
        }
        if (high<l || low>r){  // low, high[0,2]l, r[3,8]
            // No overlap 
            return Integer.MIN_VALUE;  // Return minimum possible value
        }
        int mid=(low+high)/2;
        int left=query(2*ind+1,low,mid,l,r);  // Query left Child
        int right=query(2*ind+2,mid+1,high,l,r);  // Query right
        return Math.max(left,right);  // Return the max of both the ch
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter the elements: ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        build(0,0,n-1);  // Build the segment Tree
        System.out.print("Enter the number of queries: ");
        int q=sc.nextInt();
        while (q--> 0){
            System.out.print("Enter the range [l,r]: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int result=query(0,0,n-1,l,r);
            System.out.println("Maximum in Range ["+l+","+r+"]is: "+result);
        }
        sc.close();
    }
}