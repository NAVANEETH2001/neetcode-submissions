class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int [nums.length];
        int r = 1;
        for(int i = 1;i<nums.length;i++) {
            r *= nums[i-1];
            result[i] = r;
        }
        result[0]=1;
        r=1;
        for(int i = nums.length-2;i>=0;i--) {
            r*=nums[i+1];
            result[i]=result[i]*r;
        }

        return result;
    }
}  
