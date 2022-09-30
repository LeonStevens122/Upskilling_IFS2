


import static javax.swing.JOptionPane.showInputDialog;
import java.util.Scanner;
public class prime {


static boolean isStringInt(String s)
    {
        // this function takes a string as a parameter and
        // checks if the string is an integer and returns a boolean value
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }

    public static void main(String[] args) {

        // Initiate variables with initial values
        int userInteger = 0;
        String userInput = "";
        boolean numberIsInteger = false;
        boolean numberIsNotPrime = false;


        // this While loop keeps asking the user to enter a number until the user enters a Positive integer
        // The while loop runs until the user enters a valid integer that is larger than 0
        while (!numberIsInteger || (userInteger <= 0)) {
            // Scanner created to get user input
            Scanner input = new Scanner(System.in);

            // Get user input using a Dialog box, imported from javax.swing

            userInput = showInputDialog("Please enter a Positive Integer greater than 0 : ");
            // Call the isStringInt function to check if the user input is an integer
            numberIsInteger = isStringInt(userInput);

            // if the user entered an integer = parse the user input to an integer and assign the integer value to the userInteger variable
            if (numberIsInteger) {
                userInteger = Integer.parseInt(userInput);
            }

        }

        userInteger = Integer.parseInt(userInput);
        // this for loop runs from 2 till the user entered integer
        // if the number can be divided by any number in the range between 2 and the number itself without a remainder
        // the number is not a prime number - the boolean numberIsPrime is updated to false and the loop breaks
        for (int i = 2; i <= userInteger / 2; ++i) {
            // condition for nonprime number
            if (userInteger % i == 0) {
                numberIsNotPrime = true;
                break;
            }

        }
        // conditional to print out whether the number is a prime number or not.
        if (!numberIsNotPrime)
            System.out.println(userInteger + " is a prime number.");
        else
            System.out.println(userInteger + " is not a prime number.");

    }
}