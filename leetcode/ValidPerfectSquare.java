class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 0, high = num, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            long sq = mid * mid;

            if (sq == num) {
                return true;
            } else if (sq < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
