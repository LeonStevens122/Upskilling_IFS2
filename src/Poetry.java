import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Formatter;
import java.util.Scanner;

public class Poetry {

    public static void main(String[] args) throws URISyntaxException, UnsupportedEncodingException {
        // Initialize a String variable to be encrypted
        String stringToEncrypt;

        // Get a String from the file and save it to a string
        stringToEncrypt = readFile();
        String encryptedString = encryptString(stringToEncrypt);
        //use the function to encrypt the string with the vowels capitilised
        // and save that to a string.
        String VowelString = capitalVowels(encryptedString);

        // Call the stringToEncrypt method inside a writefile() method call to write the
        // encrypted string to a new file. as per task 1
        writeFile(encryptedString);

        // Function to write the Encrypted string with capital vowels to the file as per Task 2
        writeVowel(VowelString);
    }

    private static void writeFile( String str) throws URISyntaxException, UnsupportedEncodingException
    {
        // get the root path for the files
        File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
        // use a try / catch block to open a file and write the string parameter to the file
        try {
            // C:\Users\steve\IdeaProjects\Upskilling_IFS2\src>
            // USe formatter to open the file for writing
            Formatter f = new Formatter("C:\\Users\\steve\\IdeaProjects\\Upskilling_IFS2\\src\\encodedPoem.txt");
            f.format(str);

            // close file after writing
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error writing to file : " + e);
        }

    }

    private static void writeVowel( String str) throws URISyntaxException, UnsupportedEncodingException
    {
        // get the root path for the files
        File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
        // use a try / catch block to open a file and write the string parameter to the file
        try {
            // C:\Users\steve\IdeaProjects\Upskilling_IFS2\src>
            // USe formatter to open the file for writing
            Formatter f = new Formatter("C:\\Users\\steve\\IdeaProjects\\Upskilling_IFS2\\src\\capitalVowels.txt");
            f.format(str);

            // close file after closing
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error writing to file : " + e);
        }

    }

    private static String capitalVowels(String str)
    {
        // create string to return the encrypted value
        String capitalVowelsString = null;

        //convert input string to an Array of characters
        char[] characterArray = str.toCharArray();
        // iterate through all the characters in the array
        for (Character charToEncrypt : characterArray)
        {
            // Determine the Ascii value of the character
            int ascii = (int) charToEncrypt;
            int[] vowelAscii =  new int[]{ 97, 101, 105, 111, 117 };

            // check the ascii value of the character against predetermined values
            // - remove 32 from Ascii value if it is a vowel
            if (  ascii == 97 ||  ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117)
            {
                // Add Capitilized Vowel Character to the output string
                capitalVowelsString += (char) (ascii + -32);
            }

            else
            {
                // Add Non Vowelletters to the Ascii String without changing them
                capitalVowelsString += charToEncrypt;
            }
        }


        return capitalVowelsString;
    }
    private static String encryptString(String str)
    {
        // Create new string to store encrypted return value

        String encryptedString = new String();
        //convert input string to an Array of characters
        char[] characterArray = str.toCharArray();
        // iterate through all the characters in the array
        for (Character charToEncrypt : characterArray)
        {
            // Determine the Ascii value of the character
            int ascii = (int) charToEncrypt;

            // System.out.println("Ascii " + ascii );
            // check the ascii value of the character against predetermined values
            // and add 15 to the ascii value or minus 25 from the ascii value to convert to strings only.

            if ( (ascii >= 65 && ascii <= 75) || (ascii >= 97 && ascii <= 107) )
            {
                encryptedString += (char) (ascii + 15);
            }
            else if ( (ascii >= 76 && ascii <= 90) || (ascii >= 108 && ascii <= 122) )
            {
                encryptedString += (char) (ascii + -11);
            }
            // if the character is not an alphabet letter
            // add it to the string as is without changing the value
            else
            {
                encryptedString += charToEncrypt;
            }
        }
        // System.out.println("String after encryption : " + encryptedString);

        // return the encrypted string
        return encryptedString;
    }

    private static String readFile() throws URISyntaxException
    {
        String returnString = "";
        // Determine the current URL to
        File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
        // Read File inside try / catch block
        // read file contents to a string and return the string to the calling function

        try
        {
            // open file x using root
            File x = new File(root, "poem.txt");
            // use Scanner to read contents of the file
            Scanner sc = new Scanner(x);
            //While loop reads each line of the file and saves it to a string variable
            while (sc.hasNext())
            {
                returnString = returnString + ((String) sc.next());
            }
        }
        // Catch exception if the file does not exist
        catch (FileNotFoundException e)
        {
                System.out.println("Error Reading from file");
        }
        // Return the contents of the file

        return returnString;
    }
}
