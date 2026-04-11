public class FibbonacciSpaceOptimized {
    public static int fib(int n){
        if (n<=1) return n;
        int p2=0, p1=1;  // Space Complexity 0[1] Constant
        for (int i=2;i<=n;i++){  // {Big O[n]}
            int curr=p2+p1;
            p2=p1;
            p1=curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println("The Fibonacci of the Index: "+ n + " is " +fib(n));
    }
}