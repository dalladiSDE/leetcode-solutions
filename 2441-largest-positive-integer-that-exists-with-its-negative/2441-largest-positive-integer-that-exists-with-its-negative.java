class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left] == -nums[right]){
                return nums[right];
            }
            else if(nums[right]>-nums[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return -1;
        
    }
}