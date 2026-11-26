

// 1572. Matrix Diagonal Sum
// TC: O(n)
// SC: O(1)
class Prob_1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

         if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        
        return sum;
    }
}
