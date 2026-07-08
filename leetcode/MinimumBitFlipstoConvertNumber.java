class Solution {

    public int minBitFlips(int start, int goal) {

        // XOR gives 1 where the bits are different
        int xor = start ^ goal;

        // Store answer
        int count = 0;

        // Check every bit
        while (xor != 0) {

            // If last bit is 1, one flip is needed
            if ((xor & 1) == 1) {
                count++;
            }

            // Move to the next bit
            xor = xor >> 1;
        }

        // Return total flips
        return count;
    }
}
