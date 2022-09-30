import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class multipleElements {

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


    public static void main(String[] args)
    {
        // Declare multidimentional array
        int[][] multiplicationArray;
        multiplicationArray = new int[4][4];
        // Scanner created to get user input
        Scanner input = new Scanner(System.in);

        System.out.println();
        int userInteger = 0;
        String userInput = "";
        boolean numberIsInteger = false;

        // Use a For loop to ask the user to enter 4 integers
        for (int i = 0;  i < 4; i++)
        {
            // USe a Show a dialog box to get user input as a string
            userInput = showInputDialog("Please enter a positive integer ");
            numberIsInteger = false;
            while (!numberIsInteger)
            {
                // Get user input using a Dialog box, imported from javax.swing
                userInput = showInputDialog("Please enter a Positive Integer greater than 0 : ");
                // Call the isStringInt function to check if the user input is an integer
                numberIsInteger = isStringInt(userInput);
                // if the user entered an integer = parse the user input to an integer and assign the integer value to the userInteger variable
                if (numberIsInteger)
                {
                    // Parse the string to an integer
                    userInteger = Integer.parseInt(userInput);
                    // Assign the integer value to the [i][0]th element of the array
                    multiplicationArray[i][0]= userInteger;

                    for (int arrayCounter = 0; arrayCounter < 4; arrayCounter++)
                    {
                        multiplicationArray[i][arrayCounter] = multiplicationArray[i][0] * arrayCounter;
                    }

                }
            }

        }






    }
}
