class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        // If the total number of elements doesn't match, reshaping is impossible
        if (m * n != r * c) {
            return mat;
        }
        
        // Create the new 2D matrix with the target dimensions
        int[][] newMat = new int[r][c];
        int count = 0;
        
        // Iterate through the original matrix and fill the new one
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Map the linear 'count' to the new row and column
                newMat[count / c][count % c] = mat[i][j];
                count++;
            }
        }
        
        return newMat;
    }
}
