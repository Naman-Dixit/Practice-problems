import java.util.Scanner;

public class JavaFunctions {

    // 1. Average of three numbers
    static void printAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
    }

    // 2. Sum of odd numbers from 1 to n
    static int sumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    // 3. Greater of two numbers
    static int greater(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Circumference of a circle
    static double circumference(double r) {
        return 2 * Math.PI * r;
    }

    // 5. Voting eligibility
    static boolean isEligible(int age) {
        return age > 18;
    }

    // 6. Infinite loop using do-while
    static void infiniteLoop() {
        do {
            System.out.println("Infinite Loop Running...");
        } while (true);
    }

    // 8. Power x^n
    static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    // 9. GCD of two numbers
    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    // 10. Fibonacci series
    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Average
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printAverage(a, b, c);

        // 2. Sum of odds
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of odd numbers = " + sumOfOdds(n));

        // 3. Greater number
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Greater number = " + greater(x, y));

        // 4. Circumference
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Circumference = " + circumference(r));

        // 5. Voting eligibility
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println(isEligible(age) ? "Eligible to vote" : "Not eligible");

        // 7. Count positives, negatives, zeros
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;

            System.out.print("Continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y');

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zeros: " + zero);

        // 8. Power
        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println("Power = " + power(base, exp));

        // 9. GCD
        System.out.print("Enter two numbers for GCD: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("GCD = " + gcd(p, q));

        // 10. Fibonacci
        System.out.print("Enter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        fibonacci(terms);

        // ⚠ Infinite loop (commented for safety)
        // infiniteLoop();
    }
}
