import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Take number of columns from user
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][cols];

        // Take matrix elements as input
        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // Take the number we want to search
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        // Search for x in the matrix
        System.out.println("Number " + x + " occurs at:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                // If current element is equal to x
                if (matrix[i][j] == x) {

                    // Print row and column index
                    System.out.println("Row: " + i + ", Column: " + j);
                }
            }
        }

        sc.close();
    }
}
