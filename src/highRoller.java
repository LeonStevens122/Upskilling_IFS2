import javax.swing.*;
import java.util.Scanner;

import static java.lang.Math.random;
import static javax.swing.JOptionPane.showInputDialog;

// Create Java Class
public class highRoller {
    // Main function
    public static void main(String[] args) {

        // Scanner created to get user input
        Scanner input = new Scanner(System.in);
        // System.out.println();
        // Get user input using a Dialog box, imported from javax.swing
        String userName = showInputDialog("Please enter your name: ");

        // Print out the input gotten from the user & instructions on how the game works
        System.out.println("Hello " + userName);
        System.out.println("This is a game where you and the computer alternate rolling a single dice.");
        System.out.println("The player with the highest score after each round of rolls wins the round");
        System.out.println("The player with the highest total score after 3 rounds wins the game. " + '\n');

        // define the range for the Random numbers
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int userTotal = 0;
        int computerTotal = 0;
        int userDice_roll = 0;
        int computerDice_roll = 0;


        // For Loop runs 3 times, to simulate the 3 dice rolls for both the user and the computer
        for (int i = 0; i < 3; i++) {
            String roll = showInputDialog("Press Enter to roll the dice.  ");

            // generate random numbers within 1 to 6 - this is the user's dice roll
            userDice_roll = (int) (Math.random() * range) + min;

            // let the user know what his dice roll was
            System.out.println(userName + " has rolled a " + userDice_roll);
            // add the rolled value to a userTotal variable to calculate the total rolled over the 3 rolls
            userTotal = userTotal + userDice_roll;

            // generate random numbers within 1 to 6 - this is the computer's dice roll
            computerDice_roll = (int) (Math.random() * range) + min;
            // let the user know what his opponen't dice roll was
            System.out.println("the computer has rolled a " + computerDice_roll);
            // add the rolled value to a userTotal variable to calculate the total rolled over the 3 rolls
            computerTotal = computerTotal + computerDice_roll;


            // If statement lets the user know who won the round
            if (userDice_roll > computerDice_roll) {
                System.out.println(userName + " wins the round with a roll of  " + userDice_roll + '\n');

            } else if (computerDice_roll > userDice_roll) {
                System.out.println("The Computer wins the round with a roll of " + computerDice_roll + '\n');
            } else {
                System.out.println("This round is a tie, both have rolled a " + userDice_roll + '\n');
            }


        }

        // Use an if statement to see who rolled the highest total
        if (userTotal > computerTotal) {
            // if the user rolled a higer total - tell them they have won, and print the user & Computer's totals
            System.out.println("Congratulations " + userName + " You have won the game, the total of your dice rolls was " + userTotal);
            System.out.println("The computer's total was " + computerTotal + '\n');
        } else if (userTotal < computerTotal) {

            // if the computer has rolled a higher total, tell the user they have lost and print the user & Computer's totals
            System.out.println("Better luck next time " + userName + " You have lost, the total of your dice rolls was " + userTotal);
            System.out.println("The computer won the game with a total of " + computerTotal + '\n');
        } else {
            // else statement to handle an edge case where the totals are equal
            System.out.println("It is a tie " + userName + " the total of your dice rolls was " + userTotal);
            System.out.println("The computer rolled a  total of " + computerTotal + '\n');


        }
    }

}


