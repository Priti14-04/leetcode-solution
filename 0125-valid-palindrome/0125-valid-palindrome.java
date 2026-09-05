class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
        String res = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || 
            s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'|| s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                res = res + s.charAt(i);
            }
        }
        
        int i =0,j=res.length()-1;
        while(i<j){
            if(res.charAt(i) != res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}