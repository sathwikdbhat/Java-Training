class Solution {
    // Directions for 8 neighbors (Horizontal, Vertical, Diagonal)
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int islandCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If cell is Land ('L') and not yet visited, we found a new island
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    dfs(i, j, grid, visited, n, m);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void dfs(int x, int y, char[][] grid, boolean[][] visited, int n, int m) {
        visited[x][y] = true;

        // Check all 8 possible directions
        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // Boundary checks and condition checks
            if (newX >= 0 && newX < n && newY >= 0 && newY < m && 
                grid[newX][newY] == 'L' && !visited[newX][newY]) {
                dfs(newX, newY, grid, visited, n, m);
            }
        }
    }

    // Main method to run the code in VS Code
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example Input
        char[][] grid = {
            {'L', 'L', 'W', 'W', 'W'},
            {'W', 'L', 'W', 'W', 'L'},
            {'L', 'W', 'W', 'L', 'L'},
            {'W', 'W', 'W', 'W', 'W'},
            {'L', 'W', 'L', 'L', 'W'}
        };

        int result = sol.countIslands(grid);
        System.out.println("Number of Islands: " + result);
    }
}