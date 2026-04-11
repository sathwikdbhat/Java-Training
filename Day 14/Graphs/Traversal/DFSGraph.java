import java.util.ArrayList;
import java.util.List;
class GraphDFS{
    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> ans){
        visited[node]=true;
        ans.add(node);  // Traverse the neighbours if not visited & do a dfs call
        for (int neighbour : adjList.get(node)){
            if (!visited[neighbour]){
                dfs(neighbour, adjList, visited, ans);
            }
        }
    }
    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList){
        boolean[] visited=new boolean[V+1];  // For both 0 & 1
        List<Integer> ans=new ArrayList<>();
        int start=1;  // Only our example
        dfs(start, adjList, visited, ans);
        return ans;
    }
}
public class DFSGraph {
    public static void main(String[] args) {
        int V=5;  // Number of Nodes
        List<List<Integer>> adjList= new ArrayList<>();
        //If we use this structure List<List>, we need to intialize to empty lists first.
        // Node 1: {}, Node 2: {}, Node 3: {} and so on.....
        for(int i=0; i<=V;i++){
            adjList.add(new ArrayList<>());
        }
        // Adding the edges (Undirected Graph)
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 2, 5);
        addEdge(adjList, 4, 5);
        GraphDFS obj=new GraphDFS();
        List<Integer> ans=obj.dfsGraph(V, adjList);
        printDFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);  // undirected u <--> v
    }
    // Method to print the BFS Result
    public static void printDFS(List<Integer> ans){
        for (int num:ans){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}