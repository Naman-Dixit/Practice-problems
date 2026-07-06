import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        // Stack to store valid scores
        Stack<Integer> stack = new Stack<>();

        // Traverse every operation
        for (String op : operations) {

            // Case 1: Remove the previous score
            if (op.equals("C")) {
                stack.pop();
            }

            // Case 2: Double the previous score
            else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            }

            // Case 3: Sum of previous two scores
            else if (op.equals("+")) {

                // Store last score
                int last = stack.pop();

                // Get second last score
                int secondLast = stack.peek();

                // Put back the last score
                stack.push(last);

                // Push their sum
                stack.push(last + secondLast);
            }

            // Case 4: Normal integer score
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        // Calculate final answer
        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
