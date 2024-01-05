// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: Iterate through the entire array starting from index position 0. Use two pointers to see for the sum of variable resulting in zero. If the sum is zero, then store in the arraylist or else keep iterating. 


class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = n - 1;

           while (left < right) {
           int currSum = nums[i] + nums[left] + nums[right];
           if (currSum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;

            while (left < right && nums[left] == nums[left - 1]) {
                left++;
            }
            while (left < right && nums[right] == nums[right + 1]) {
                right--;
            }
        }   else if (currSum < 0){
             left++;
        } 
        
            else {
             right--;
        }
    }
}
        return result;
    }
}