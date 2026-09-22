/*Question link - https://leetcode.com/problems/3sum/

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105*/
import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Sort the array so we can cleanly look for duplicates
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            // Skip the duplicate "First Persons" so we don't get duplicate answers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 2: Use our two pointers to find the other two numbers
            searchPairs(nums, i);
        }
        return res;
    }

    private void searchPairs(int[] nums, int firstIndex) {
        int left = firstIndex + 1;    // Starts right after the first number
        int right = nums.length - 1;  // Starts at the very end of the array
        
        while (left < right) {
            int currentSum = nums[firstIndex] + nums[left] + nums[right];
            
            if (currentSum == 0) {
                // Found a perfect match! Save it to the results list
                res.add(Arrays.asList(nums[firstIndex], nums[left], nums[right]));
                
                left++;  // Move left pointer forward
                right--; // Move right pointer backward
                
                // Skip duplicate numbers for 'left' to avoid repeating the same answer
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                // Skip duplicate numbers for 'right'
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
                
            } else if (currentSum < 0) {
                // The sum is too small! We need a bigger number.
                // Move the left pointer forward (to get a larger value).
                left++;
            } else {
                // The sum is too big! We need a smaller number.
                // Move the right pointer backward (to get a smaller value).
                right--;
            }
        }
    }
}
