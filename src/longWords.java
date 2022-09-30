import java.util.ArrayList;


import static javax.swing.JOptionPane.showInputDialog;

public class longWords {
    public static void main(String[] args)
    {
        // Initialize the variables

        // Create a new ArrayList of Strings
        ArrayList<String> listOfWords = new ArrayList<>();

        String userInput = null;
        int largeWords = 0;
        int totalLengthOfWords = 0;

        // use a While list to allow the user to enter an unknown number of strings
        while (!("0".equals(userInput)))
        {
            // Get user input using a Dialog box, imported from javax.swing
            userInput = showInputDialog("Please enter Word - Enter the number 0 to stop entering words ");
            // IF the input is anything other than "0" add the input to the listOfWords ArrayList
            if (!("0".equals(userInput)))
            {
                listOfWords.add(userInput);
            }
        }

        // Iterate through the ListOfWords arrayList
        for(String word : listOfWords)
        {
            // Add the length of each word to a variable to get the total length of all the words
            totalLengthOfWords = totalLengthOfWords + word.length();
            // Check if the word is longer than 4 letters and if it is, add 1 to the largeWords integer variable
            if (word.length() > 4) {
                largeWords++;
            }
        }

        // Display the number of words that are longer than 4 letters
        System.out.println('\n' + "The list of words contains " + largeWords + " words that are longer than 4 letters" + '\n');

        // Display the average length of all the words given.
        System.out.println("The average length of all the words added to the list is " + (totalLengthOfWords / listOfWords.size()) + '\n');

    }
}
