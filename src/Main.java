
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Determine the day of the week
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
                break;
        }

        // Display the result
        System.out.println(dayName);

        scanner.close();
    }
}


//public class CoffeeShop {
//    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Welcome to Java Coffee Shop!");
        System.out.println("Menu:");
        System.out.println("A → Americano → $3.00");
        System.out.println("C → Cappuccino → $3.75");
        System.out.println("L → Latte → $4.00");
        System.out.println("E → Espresso → $2.50");

        // Ask for user choice
        System.out.print("Enter your choice (A, C, L, or E): ");
        String choice = scanner.nextLine().toUpperCase(); // convert to uppercase to handle lowercase input

        // Determine price based on choice
        switch (choice) {
            case "A":
                System.out.println("You selected Americano → $3.00");
                break;
            case "C":
                System.out.println("You selected Cappuccino → $3.75");
                break;
            case "L":
                System.out.println("You selected Latte → $4.00");
                break;
            case "E":
                System.out.println("You selected Espresso → $2.50");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class CheckPrime {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check divisibility from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // If divisible by any number, not prime
            }
        }

        return true; // Otherwise, it's prime
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check and display result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}*/