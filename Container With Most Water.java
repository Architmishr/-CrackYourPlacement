class Solution {
    public int maxArea(int[] height) {
        int l=0, r = height.length-1 , maxArea = 0;
        while(l<r){
                
            int curArea = Math.min(height[l], height[r]) * (r-l);
            if(curArea > maxArea)
                maxArea = curArea;
            
            if(height[l] <= height[r]){
				l++;
			}
			else{
				r--;
			}
        }
		return maxArea;
    }
}
