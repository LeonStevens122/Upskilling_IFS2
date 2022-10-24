import java.util.Scanner;

public class palindromeRecursion {

    public static boolean isPalindrome(String str)
    {
        // If the length of the input string = 0 OR 1
        // Return true
        if (str.length()  == 0 || str.length() == 0)
        {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length()-1))
        {
            //Check if the first and last character in the string are the same
            // if they are, then the string may be a palindrome.
            // Now we repeat the same with a substring of the original string
            //With the first and last letters removed.
            return isPalindrome(str.substring(1, str.length()-1));
        }

        //Now if the function did not return true for the first if statement
        // and the secind if statement was not true to call the function recursively
        //  we know its not a palindrome and we return false
        return false;

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a Word to check if it is a palindrome : ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString))
        {
            System.out.println(inputString + " Is a Palindrome");
        }
        else
        {
            System.out.println(inputString + " Is NOT a Palindrome");
        }

    }
}
