class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = k * threshold;
        int count = 0;
        int sum = 0;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= windowSum) {
            count++;
        }

        // Slide the window
        for (int j = k; j < arr.length; j++) {
            sum = sum - arr[j - k];
            sum = sum + arr[j];

            if (sum >= windowSum) {
                count++;
            }
        }

        return count;
    }
}
