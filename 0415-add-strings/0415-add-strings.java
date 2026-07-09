class Solution {
    public String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        StringBuilder sb= new StringBuilder();
        int n = c1.length, m = c2.length, left = n-1, right = m-1, carry = 0;
        while(left>=0 || right>=0 || carry>0){
            int sum = carry ;
            if(left>=0){
                sum += c1[left--] - '0';
            }
            if(right>=0){
                sum += c2[right--] - '0'; 
            }
            carry = sum/10;
            sb.append(sum%10);
        }
        
        return sb.reverse().toString();
        
    }
}