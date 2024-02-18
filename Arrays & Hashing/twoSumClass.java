import java.util.HashMap;

class twoSumClass {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = hm.get(target - nums[i]);
            }else{
                hm.put(nums[i],j);
                j++;
            }
        }
        return res;
    }
}