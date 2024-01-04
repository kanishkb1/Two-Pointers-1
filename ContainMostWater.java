// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: We will calculate the area between the two bars using distance between them and minimum height of the bars. 



class ContainsMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int left = 0, right = n-1;
        while (left < right){
            int current = Math.min(height[left] , height[right]) * (right - left);
            max = Math.max(max,current);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}