class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length  = s.length();

        for(int i = 1 ; i<= length/2 ;  i++){
            if(length%i !=0) continue;
            int k=i, idx=0, counter = i;
            while(k<length){
                idx=0;
                counter=i;
                while(counter-->0){
                    if(s.charAt(idx)==s.charAt(k+idx)){
                        idx++;
                    }
                    else{
                        break;
                    }
                }
                if(counter>=0) break;
                k = k+i;
            }
            if(k==length) return true;
        }
        return false;
        
    }
}