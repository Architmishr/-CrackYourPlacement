class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int r=0,w=0,b=0;
        for(int i=0; i<n; i++){
            switch(nums[i]){
                case 0:
                    r++;
                    break;
                case 1:
                    w++;
                    break;
                case 2:
                    b++;
                    break;
            }
        }
        for(int i=0; i<r; i++){
            nums[i]=0;
        }
        for(int i=r; i<r+w; i++){
            nums[i]=1;
        }
        for(int i=r+w; i<r+w+b; i++){
            nums[i]=2;
        }
    }
}
