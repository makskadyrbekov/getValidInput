//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/***
 * STUDENT : Maksat Kadyrbekov
 */
public class Main {

    // Generalized input-validation function
    public static int getValidInput(int lowerBound, int upperBound, String prompt, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            System.out.println(prompt);

            // Check if input is an integer
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();

                // Validate the input range
                if (userInput >= lowerBound && userInput <= upperBound) {
                    return userInput;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        // Test the input-validation function with a driver program
        int lowerBound = 10;
        int upperBound = 50;
        String prompt = "Please enter a value between " + lowerBound + " and " + upperBound + ":";
        String errorMessage = "Your value is invalid. Please try again.";

        // Call the getValidInput function and store the result
        int validInput = getValidInput(lowerBound, upperBound, prompt, errorMessage);

        // Display the chosen value
        System.out.println("The value chosen by the user is: " + validInput);
    }
}

