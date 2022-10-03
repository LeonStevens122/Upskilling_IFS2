import java.util.HashSet;
import java.util.Set;

//
public class NoRepeats {



    public static String removeDuplicates(String str)
    {
        // cponvert the string to an array
       char[] characterArray = str.toCharArray();

       // initialise a blank string
       String returnString = "";

       // initialise a set
       Set<Character> uniqueChars = new HashSet<>();

        // Iterate over the Character array and add the letters in the array to a Set.
        // A set cannot include duplicates So we will use the Set to check if a letter exists in the input string
        // I am converting the characters to upper case to ensure there are no duplicates in either upper or lower case
        for (Character charToAddToSet : characterArray)
        {
            uniqueChars.add(  (Character.toUpperCase(charToAddToSet) ));
        }

        // Iterate over the character array again
        for (Character chars : characterArray)
        {
            // Check if the character is a blank space OR if the character exists in the Set of unique characters
            if ((Character.isWhitespace(chars)) )
                // if the character is a blank space, add it to the return string.
                returnString = returnString + chars;

                //Now check if the character is in the Set of unique strings and add it to the string if true
                // I am using the toUpperCase() to make sure it matches the characters in the uppercase set.
                if (uniqueChars.contains(Character.toUpperCase(chars)) && !(Character.isWhitespace(chars)))
                {
                    {
                        // If the character is in the unique Set of characters
                        // add it to the output string
                        returnString = returnString + chars;
                        // Remove the character from the Set (using the toUpperCase() Method to check for upper case letters
                        uniqueChars.remove(Character.toUpperCase(chars));
                    }
                }
        }
        // Return the string with all duplicates - Upper & Lower Case removed.
        return returnString;
    }

    public static void main(String[] args)
    {
        // Create a new String
        String inputString = new String("And I think to myself: what a wonderful world!");

        System.out.println("The First string before duplicates are removed" );
        System.out.println(inputString + '\n');

        System.out.println("The First string after duplicates are removed" );
        // Print out the result of the stringToArray Method
        System.out.println(removeDuplicates(inputString) + '\n');

        // Checking with another string to confirm
        inputString = "The quick Brown fox jumps over the lazy dog!";

        System.out.println("The Second string before duplicates are removed" );
        System.out.println(inputString + '\n');
        System.out.println("The Second string After duplicates are removed" );
        System.out.println(removeDuplicates(inputString) + '\n');

    }
}
