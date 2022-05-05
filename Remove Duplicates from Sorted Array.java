class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j]= nums[i];
            }
        }
        j++;
        return j;
    }
}
