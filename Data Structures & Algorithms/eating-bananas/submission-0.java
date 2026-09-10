class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        
        for(int i = 0 ;i<piles.length;i++) {
            right = Math.max(right,piles[i]);
        }

        while(left<=right) {
            int mid = left+(right-left)/2;
            if(canFinish(piles,mid,h)){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return left;

    }

    private boolean canFinish(int [] piles , int speed, int h) {
        int hour = 0;
        for(int pile : piles){
            hour+= Math.ceil((double)pile/speed);
        }
        return hour<=h;
    }
}
