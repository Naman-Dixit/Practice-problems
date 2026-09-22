class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int track = 1; // Tracks where to write the next unique number

        // 'i' walks through the line starting from the second person
        for (int i = 1; i< nums.length; i++) {
            
            // Is this person different from the person right behind them?
            if (nums[i] != nums[i - 1]) {
                
                // Yes! Overwrite the duplicate at 'writer' with this unique person
                nums[track] = nums[i]; 
                
                // Move the writer hook forward
                track++; 
            }
        }

        // 'writer' now equals the total number of unique people
        return track; 
    }
}
