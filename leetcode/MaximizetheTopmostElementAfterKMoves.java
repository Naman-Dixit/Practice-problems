class Solution {

    public int maximumTop(int[] nums, int k) {

        // Number of elements
        int n = nums.length;

        // Case 1:
        // Only one element in the stack
        if (n == 1) {

            // Odd moves -> stack becomes empty
            if (k % 2 == 1) {
                return -1;
            }

            // Even moves -> same element remains
            return nums[0];
        }

        // Case 2:
        // No moves
        if (k == 0) {
            return nums[0];
        }

        // Store maximum value
        int max = -1;

        // Find maximum among first (k-1) elements
        for (int i = 0; i < Math.min(n, k - 1); i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Case 3:
        // If kth element exists,
        // compare it with the maximum found
        if (k < n) {
            max = Math.max(max, nums[k]);
        }

        // Return the answer
        return max;
    }
}
