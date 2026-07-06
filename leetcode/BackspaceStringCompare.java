import java.util.Stack;

class Solution {

    public boolean backspaceCompare(String s, String t) {

        // Process both strings after applying backspaces
        String first = buildString(s);
        String second = buildString(t);

        // Compare final strings
        return first.equals(second);
    }

    // Function to build the final string
    public String buildString(String str) {

        Stack<Character> stack = new Stack<>();

        // Traverse every character
        for (char ch : str.toCharArray()) {

            // If current character is '#'
            if (ch == '#') {

                // Remove previous character if available
                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                // Normal character
                stack.push(ch);
            }
        }

        // Convert stack into string
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        // Stack gives characters in reverse order
        return ans.reverse().toString();
    }
}
