class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0,j=0,sum=0,res=0;
        Set<Integer> set =  new HashSet<>();
        while (i<nums.length && j<nums.length){
            if(!set.contains(nums[j])){
                sum+=nums[j];
                set.add(nums[j]);
                res = Math.max(sum,res);
                j++;
            }else{
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        return res;
    }
}
