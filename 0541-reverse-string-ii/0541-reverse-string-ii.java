class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length(), idx=0;
        char[] ch = s.toCharArray();
        while(idx<n){
            int left=idx,right=Math.min(idx+k-1,n-1);
            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            idx = idx + 2*k;

        }
        return new String(ch);
        
    }
}