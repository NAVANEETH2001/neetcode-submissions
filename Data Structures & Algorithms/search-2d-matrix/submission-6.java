class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int lastCol = matrix[0].length - 1;

        // Find the correct row
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target >= matrix[mid][0] &&
                target <= matrix[mid][lastCol]) {

                int row = mid;

                // Binary search inside the row
                int colLeft = 0;
                int colRight = lastCol;

                while (colLeft <= colRight) {
                    int colMid = colLeft + (colRight - colLeft) / 2;

                    if (matrix[row][colMid] == target) {
                        return true;
                    } else if (target > matrix[row][colMid]) {
                        colLeft = colMid + 1;
                    } else {
                        colRight = colMid - 1;
                    }
                }

                return false;
            } else if (target < matrix[mid][0]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}