class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s =new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int ans=-1;
        for(int i : nums){
            if(i>0){
                if(s.contains(-i)){
                    ans=Math.max(i,ans);
                }
            }
        }

        return ans;
    }
}