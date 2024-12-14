import java.util.Scanner;

public class Mod5CTA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You will enter five numbers.");
        int totalSum = calculateSum(5, scanner);

        System.out.println("The sum of the five numbers is: " + totalSum);
    }

    // Recursive method to calculate the sum of n numbers
    public static int calculateSum(int count, Scanner scanner) {
        // Base
        if (count == 0) {
            return 0;
        }
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Recursive
        return number + calculateSum(count - 1, scanner);
    }
}
