class Solution {

    public int singleNumber(int[] nums) {

        // Store the final answer
        int answer = 0;

        // Traverse the entire array
        for (int i = 0; i < nums.length; i++) {

            // XOR the current number with answer
            // Duplicate numbers become 0
            // The unique number remains
            answer = answer ^ nums[i];
        }

        // Return the single number
        return answer;
    }
}
