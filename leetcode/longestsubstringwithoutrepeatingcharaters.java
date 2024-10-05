/*Question link - https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();
        int max = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            // If character is not in the set, add it and expand the window
            if (!seen.contains(c)) {
                seen.add(c);
                max = Math.max(max, right - left + 1);
                right++; // Expand the window by moving right pointer
            } else {
                // If character is a duplicate, shrink the window by moving left
                while (s.charAt(left) != c) {
                    seen.remove(s.charAt(left)); // Remove characters until the duplicate is gone
                    left++;
                }
                // Remove the duplicate character and move left pointer by one
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return max; // Return the maximum length of the substring without repeating characters
    }
}
