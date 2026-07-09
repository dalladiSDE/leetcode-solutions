class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[27];
        int length = s.length();
        for(int i=0 ; i<length ; i++){
            letters[s.charAt(i)-'a']++;
        }
        length = t.length();
        for(int i=0 ;i<length ; i++){
            letters[t.charAt(i) - 'a']--;
        }
        char ans='a';
        for(int i =0 ;i <27 ; i++){
            if(letters[i]<0){
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }
}