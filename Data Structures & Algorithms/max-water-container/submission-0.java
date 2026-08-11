class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ;
        int right = heights.length-1;
        int maxArea=0;
        while(left<right) {
            maxArea = Math.max(Math.min(heights[left],heights[right]) * (Math.abs(right-left)), maxArea);
            if(heights[left]>heights[right]) {
                int h = heights[right];
                while(heights[right]<=h && left<right) {right-- ;}
            }
            else{
                int h =heights[left];
                while(heights[left]<=h && right>left){left++ ;}
            }
        }
        return maxArea;
    }
}
