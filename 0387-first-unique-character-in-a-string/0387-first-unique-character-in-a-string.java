class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char [] ar = s.toCharArray();

        for(char ch : ar){

           hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for(int i  = 0;i<ar.length;i++){

            if(hm.get(ar[i])==1){
                return i;
            }
        }
        return -1;
    }

    
}