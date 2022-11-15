import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Exercise for ...

        // Program a 'secret number'
        // Ask user to guess the number
        // If guess is lower, print "Too low! Try again."
        // If guess is higher, print "Too high! Try again."
        // Create a loop so game runs until correct number (?)

        long x = 666;

        // Loop: while(true){} + break;

        while(true) {
            // Prompt the use for input
            System.out.println("Guess a number between 1 and 1000:");

//            // Collect user input 1
//            Scanner number = new Scanner(System.in);
//            int playerGuess = number.nextInt();

          // Collect user input 2
          Scanner scanner = new Scanner(System.in); // Prompts user for input (?)
          String guess = scanner.nextLine(); // Allows user to provide input and press return.
          int playerGuess1 = Integer.parseInt(guess); // Transforming "string" input from user into an "integer" type.

            if (playerGuess == x) {
                System.out.println("That's right!");
                break;
            } else if (playerGuess > x) {
                System.out.println("Too high! Try again."); //prints true boolean
            } else if (playerGuess < x) {
                System.out.println("Too low! Try again."); //prints true boolean
            }
        }
    }
}