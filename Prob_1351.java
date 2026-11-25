// 1351: Count Negative Numbers in a Sorted Matrix
// TC: O(n)
// SC: O(1)

class Prob_1351 {
    public int countNegatives(int[][] grid) {
        int m = grid.length;       // Total rows
        int n = grid[0].length;    // Total columns
        
        int row = m - 1;           // Start at the last row
        int col = 0;               // Start at the first column
        int negativeCount = 0;
        
        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                negativeCount += n - col; // Add all negative elements to the right
                row--;                    // Move up to the previous row
            } else {
                col++;                    // Move right to find negative numbers
            }
        }
        return negativeCount;
    }
}


