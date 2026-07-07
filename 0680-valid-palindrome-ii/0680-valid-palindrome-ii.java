class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length(), left = 0, right = n-1;
        while(left<right && s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        if(left>=right) return true;
        return palindrome(s,left,right-1) || palindrome(s,left+1,right);
        
    }
    public boolean palindrome(String s, int left, int right){
        while(left<right && s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        if(left>=right) return true;
        return false;
    }
}