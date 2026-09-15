class Solution {

    public int[] countBits(int n) {

        // Create an array to store the answer
        // ans[i] will store the number of 1s in binary of i
        int[] ans = new int[n + 1];

        // Start from 1
        // ans[0] is already 0
        for (int i = 1; i <= n; i++) {

            // i / 2 removes the last binary bit
            //
            // Example:
            // 5 = 101
            // 5 / 2 = 2
            // 2 = 10
            //
            // ans[2] tells us the number of 1s in "10"

            // i % 2 checks the last bit
            //
            // If i is even → last bit is 0
            // If i is odd  → last bit is 1

            // Therefore:
            // answer for i =
            // answer for i/2 + last bit

            ans[i] = ans[i / 2] + (i % 2);
        }

        // Return the answer array
        return ans;
    }
}
