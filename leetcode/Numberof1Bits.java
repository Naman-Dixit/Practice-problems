class Solution {

    public int hammingWeight(int n) {

        // Variable to store the number of 1 bits
        int count = 0;

        // Check all 32 bits
        while (n != 0) {

            // If the last bit is 1, increase the count
            if ((n & 1) == 1) {
                count++;
            }

            // Unsigned right shift by 1 bit
            // This moves to the next bit
            n = n >>> 1;
        }

        // Return the total number of 1 bits
        return count;
    }
}



public class Solution {
    public int hammingWeight(int n) {
        // 'count' keeps track of how many 1-bits we've found so far
        int count = 0;

        // Keep looping until all bits have been cleared (n becomes 0)
        while (n != 0) {
            // Brian Kernighan's trick: n & (n - 1) clears the LOWEST set bit.
            //
            // Why does this work?
            // Subtracting 1 flips all bits from the lowest set bit downward.
            // Example: n = 1100, n-1 = 1011
            //          1100
            //        & 1011
            //        ------
            //          1000   <- the lowest 1-bit (rightmost one) is cleared
            //
            n = n & (n - 1);

            // Each time we clear a bit, that means we found one '1' bit
            count++;
        }

        // Once n is 0, there are no more 1-bits left, so we're done
        return count;
    }
}
