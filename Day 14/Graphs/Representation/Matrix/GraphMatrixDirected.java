import java.util.Scanner;

public class GraphMatrixDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> no of nodes
         // m -> no of edges
         // we cover all the node, so Time complexity is O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMatrix = new int[n+1][n+1];
        // let's take inputs for the edges from the user
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected graph u-->v
            adjMatrix[u][v] = 1;
           // adjMatrix[v][u] = 1; //skip this line for Directed graph
        }
        //Print the adjecency matrix
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
