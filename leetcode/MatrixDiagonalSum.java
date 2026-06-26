class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        
        // 1. Move declarations HERE (outside the loops)
        int leftdiagonal = 0;
        int rightdiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                // 2. Just use the variables here, don't re-declare them with 'int'
                if (i == j) {
                    leftdiagonal += mat[i][j];
                }
                
                if (j == n - 1 - i) {
                    rightdiagonal += mat[i][j];
                }
            }
        }
        
        // 3. If the matrix size is odd (like 3x3), the center element 
        // was added to BOTH diagonals. We must subtract it once.
        if (n % 2 != 0) {
            return rightdiagonal + leftdiagonal - mat[n / 2][n / 2];
        }

        return rightdiagonal + leftdiagonal;
    }
}
