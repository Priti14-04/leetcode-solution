class Solution {
    public int lengthOfLastWord(String s) {
      s = s.trim();
      int ct = 0;
      for(int i = s.length()-1;i>=0;i--){
        if(s.charAt(i) != ' '){
            ct++;
        }
        else{
            break;
        }
      }
      return ct;
    }
}