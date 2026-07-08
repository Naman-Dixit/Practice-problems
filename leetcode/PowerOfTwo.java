class Solution {

    public boolean isPowerOfTwo(int n) {

        // Numbers less than or equal to 0 cannot be powers of 2
        if (n <= 0) {
            return false;
        }

        // Keep dividing by 2 until n becomes 1
        while (n > 1) {

            // If n is not divisible by 2,
            // it is not a power of 2
            if (n % 2 != 0) {
                return false;
            }

            // Divide n by 2
            n = n / 2;
        }

        // If we reach 1, then n is a power of 2
        return true;
    }
}
