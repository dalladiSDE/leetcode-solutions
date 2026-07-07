class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,lsum=0,rsum=0,ans=0;
        
        while(left<right){
            if(height[left]<height[right]){
                if(lsum<height[left]){
                    lsum=height[left];
                    
                }
                ans=ans+lsum-height[left++];
            }
            else{
                if(rsum<height[right]){
                    rsum=height[right];
                }
                ans+=rsum-height[right--];
            }
            
        }
        return ans;
        
    }
}