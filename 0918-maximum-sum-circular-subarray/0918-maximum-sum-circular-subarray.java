class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;

        int currentmax=nums[0];
        int maxsum=nums[0];

        int currentmin=nums[0];
        int minsum=nums[0];
        
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
            if(i>0){
                currentmax=Math.max(nums[i],currentmax+nums[i]);
                maxsum=Math.max(maxsum,currentmax);
                currentmin=Math.min(nums[i],currentmin+nums[i]);
                minsum=Math.min(minsum,currentmin);
            }
        }
        if(maxsum<0){
            return maxsum;
        }
        int circularsum=totalsum-minsum;
        return Math.max(maxsum,circularsum);
    }
}