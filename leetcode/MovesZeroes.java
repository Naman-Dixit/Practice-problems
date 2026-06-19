/*283. Move Zeroes
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int temp=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(nums[i]==0){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }
        }
        for(int i=0; i<n; i++){
            System.out.println(nums[i]);
        }
    }
}
