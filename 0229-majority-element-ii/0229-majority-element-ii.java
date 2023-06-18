class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr=new ArrayList();
        
        int x=nums.length/3;
        

        for(int i=0;i<nums.length;i++){
            
            if(arr.size()==0 || arr.get(0)!=nums[i]){
                int count=0;
                for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                    
            
                } 
                if(count>x){
                        arr.add(nums[i]);
                    }           
            }
            if(arr.size()==2) break;      
            
        }
        
        return arr;
    }
}