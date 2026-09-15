class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length-1;
        int len1 = matrix[0].length-1;
        int len = matrix.length-1;
        while(left<=right) {
            int mid = left + (right-left)/2;

            if(target >= matrix[mid][0] && target <=matrix[mid][len1]) {
                int r = mid;
                left = 0;
                right = len1;
                while(left<=right){
                    mid = left + (right-left)/2;

                    if(target == matrix[r][mid]){
                        return true;
                    }
                    else if (target > matrix[r][mid]){
                        left = mid+1;
                    }
                    else {
                        right = mid-1;
                    }
                }
                return false;
            }
            else if(target < matrix[mid][0]){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }
}
