class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();

        while(n!=1 && !s.contains(n)){
            s.add(n);
            n = happyNumber(n);
        }
        return n==1;
    }
        public static int happyNumber(int num){

            int sum = 0 ;
            while(num!=0){
                int last = num%10;
                sum = sum+last*last;
                num/=10;
            }
            return sum;
        } 
        
    
}