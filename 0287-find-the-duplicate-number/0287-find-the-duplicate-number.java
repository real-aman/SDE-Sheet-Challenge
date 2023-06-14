class Solution {
    public int findDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int check=Math.abs(nums[i]);
            if(nums[check]<0){
                return check;
            }else{
                nums[check]=-nums[check];
            }
        }
        return -1;
        
    }
}