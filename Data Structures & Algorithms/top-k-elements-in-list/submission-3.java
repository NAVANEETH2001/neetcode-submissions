class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k) {
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums) {
            map.merge(num , 1, Integer ::sum);
        }
        List<Integer> [] n = new List[nums.length+1];
        for(int num : map.keySet()) {
            int f = map.get(num);
            if (n[f] == null) n[f] = new ArrayList(); 
            n[f].add(num);  
        }
        int[] result = new int[k];
        int index=0;
        for(int i = n.length-1 ; i>=0 && index <k;i--) {
                if(n[i]!=null) {
                    for(int r : n[i]){
                        result[index++]=r;
                        if(index == k){
                            break;
                        }
                    }
                }
        }
        return result;

    }
}
