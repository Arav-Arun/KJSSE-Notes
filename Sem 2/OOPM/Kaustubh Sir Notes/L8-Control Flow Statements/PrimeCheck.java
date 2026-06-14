import java.util.Scanner;

public class PrimeCheck {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // Number is divisible by i, so it's not a prime
                isPrime = false;
                System.out.println(number + " is not a prime number.");
                break; // Exit the loop early since we've found a divisor
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }

        scanner.close();
    }
}
