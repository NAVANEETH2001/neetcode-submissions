class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double [][] pt = new double [n][2];
        for(int i =0 ;i<n;i++) {
            pt[i][0]= position[i];
            pt[i][1] = (double)(target-position[i]) / speed[i]; 
        }
        Arrays.sort(pt, (a,b)-> Double.compare(b[0],a[0]));
        double max= 0;
        int c=0;
        for(int i=0;i<n;i++) {
            if(max<pt[i][1]) {
                max = pt[i][1];
                c++;
            }
        }
        return c;
    }
}
