class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0;
        long windowSum = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {

            // Include the current element
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];

            // Remove the leftmost element if window size exceeds k
            if (i >= k) {
                windowSum -= nums[i - k];
                freq.put(nums[i - k], freq.get(nums[i - k]) - 1);

                if (freq.get(nums[i - k]) == 0) {
                    freq.remove(nums[i - k]);
                }
            }

            // Check if window has size k and all elements are distinct
            if (i >= k - 1 && freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
