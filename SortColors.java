// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: We will update the input array by using two pointers approach. And, we will use third pointer 'mid' to swap the '0', '1' and 2.
class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length==0) return;

        int n = nums.length, low = 0, mid = 0, high = n -1;

        while (mid <= high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;

            }

            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 