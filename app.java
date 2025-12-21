import java.util.Scanner;

public class EvenNumberSum {

    // Method to calculate sum of even numbers up to n
    public static int sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) { // Increment by 2 for efficiency
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            int number = scanner.nextInt();

            if (number < 1) {
                System.out.println("Please enter a number greater than 0.");
                return;
            }

            int result = sumEvenNumbers(number);
            System.out.println("Sum of even numbers up to " + number + " is: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
