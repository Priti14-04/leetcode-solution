import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i= 0 ;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(Integer i : nums){
            if(hm.containsKey(i)){
                return true;
            }

            else{
                hm.put(i,1);
            }
        }

        return false;
    }
}