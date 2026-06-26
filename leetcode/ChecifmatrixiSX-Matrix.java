class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length; // Added missing semicolon
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                // Rule 1: Elements ON the diagonals
                if (i == j || j == n - 1 - i) {
                    if (grid[i][j] == 0) {
                        return false; // Diagonals cannot be 0
                    }
                } 
                // Rule 2: Elements OFF the diagonals
                else {
                    if (grid[i][j] != 0) {
                        return false; // Off-diagonals must be 0
                    }
                }
                
            }
        }
        
        // Return true ONLY after verifying every single cell successfully
        return true; 
    }
}
