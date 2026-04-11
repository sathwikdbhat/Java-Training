import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> no of nodes
        // m -> no of edges
        // we cover all the node, so Time complexity is O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        //Adjacency list representation
        List<List<Integer>> adjList= new ArrayList<>();
        //If we use this structure List<List>
        //
         //
        for(int i=0; i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        //Read the edges from the user
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            //
            adjList.get(u).add(v);
            adjList.get(v).add(u);

        }
        //
        for(int i=1; i<=n; i++){
            System.out.println("Node:"+i+":Neighbors: ");
            for(int v:adjList.get(i)){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
