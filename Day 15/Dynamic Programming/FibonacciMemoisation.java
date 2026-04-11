import java.util.*;
public class FibonacciMemoisation {  // Used to store Unknown Values
    public static int fib(int n, int[] dp){
        // Base Case
        if (n<=1)
            return n;
        // Step 2: If 
        if (dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fib(n-1,dp) + fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n=6;
        // Step 1: Create a 10 dp table of size n+1 (0-based)
        int[] dp=new int[n+1];  // 0-based indexing
        // Sub step of 1: Fill the array with default values -1
        Arrays.fill(dp,-1);
        System.out.println("Fibonacci at Index "+ n + " is "+fib(n,dp));
    }
}