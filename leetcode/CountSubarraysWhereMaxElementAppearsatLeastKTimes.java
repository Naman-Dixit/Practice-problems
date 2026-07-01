class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = nums[0];

        // Find the maximum element
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        long ans = 0;
        int left = 0;
        int countMax = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == max) {
                countMax++;
            }

            // Shrink the window until it has less than k maximum elements
            while (countMax >= k) {
                if (nums[left] == max) {
                    countMax--;
                }
                left++;
            }

            // All subarrays ending at 'right' and starting before 'left' are valid
            ans += left;
        }

        return ans;
    }
}
