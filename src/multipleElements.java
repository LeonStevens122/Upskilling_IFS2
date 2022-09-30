import static javax.swing.JOptionPane.showInputDialog;
import java.util.Arrays;
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


        int userInteger;
        String userInput ;
        boolean numberIsInteger;

        // Use a For loop to ask the user to enter 4 integers

        for (int i = 0;  i < 4; i++)
        {
            // USe a Show a dialog box to get user input as a string
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

                    // for loop populates the rest of the array with the multiples of the first number
                    for (int arrayCounter = 1; arrayCounter < 5; arrayCounter++)
                    {
                        multiplicationArray[i][arrayCounter -1] = multiplicationArray[i][0] * arrayCounter;
                    }

                }
            }

        }
        // print out the two dimensional array using the deepToString Array Method
        System.out.println((" The two dimensional array is " + Arrays.deepToString(multiplicationArray)));
    }
}
