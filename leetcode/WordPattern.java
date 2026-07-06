import java.util.HashMap;

class Solution {

    public boolean wordPattern(String pattern, String s) {

        // Split the sentence into words
        String[] words = s.split(" ");

        // If lengths are different, pattern cannot match
        if (pattern.length() != words.length) {
            return false;
        }

        // HashMap to store character -> word mapping
        HashMap<Character, String> map = new HashMap<>();

        // Traverse both pattern and words
        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // If character already exists
            if (map.containsKey(ch)) {

                // Check if mapped word is same
                if (!map.get(ch).equals(word)) {
                    return false;
                }

            } else {

                // If word is already mapped to another character
                if (map.containsValue(word)) {
                    return false;
                }

                // Create new mapping
                map.put(ch, word);
            }
        }

        return true;
    }
}
