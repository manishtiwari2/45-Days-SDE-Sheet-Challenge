class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Check if first row contains any zero
        for (int col = 0; col < cols; col++) {
            if (matrix[0][col] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Check if first column contains any zero
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Use first row and first column as markers
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Zero cells based on markers
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Zero first row if needed
        if (firstRowHasZero) {
            for (int col = 0; col < cols; col++) {
                matrix[0][col] = 0;
            }
        }

        // Zero first column if needed
        if (firstColHasZero) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}