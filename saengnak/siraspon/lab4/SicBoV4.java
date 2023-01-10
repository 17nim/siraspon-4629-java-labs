package saengnak.siraspon.lab4;

import java.util.Scanner;
import java.util.Arrays;

public class SicBoV4 {
    static int choice;
    final static int MAX_INPUT = 100;
    static String[] gamePlay = new String[MAX_INPUT];
    static String[] gameResult = new String[MAX_INPUT];
    static int currentInput = 0;

    static int dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
    static int dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
    static int dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
    static int diceSum = dice1 + dice2 + dice3;

    static String eachDice = "Dice 1: " + dice1 + ", Dice 2: " + dice2 + ", Dice 3: " + dice3;
    static String diceTotal = "Total = " + diceSum;
    static String invalidInput = "Please enter a valid input.";

    static Scanner userInput = new Scanner(System.in);

    static int rewardCalc(int matchedDice) {
        int betReward = 10 * matchedDice * ((9 % 5) + 1);
        return betReward;
    }

    static int getChoice() {
        System.out.println("Choose how do you want to bet");
        System.out.println("Type '1': Choosing between high or low number.");
        System.out.println("Type '2': Picking a number between 1 to 6.");
        System.out.print("Enter your choice (1 or 2): ");
        choice = userInput.nextInt();

        if ((choice == 1 || choice == 2) == false) {
            System.out.println(invalidInput + " (Enter 1 or 2 only!)");
            getChoice();
        }

        return choice;
    }

    static void playGame() {
        if (choice == 1) {
            System.out.print("Type 'h' for high, 'l' for low: ");
            String highOrLow = userInput.next().toLowerCase();

            if (highOrLow.equals("h") || highOrLow.equals("l")) {
                System.out.println(eachDice);
                System.out.print(diceTotal);
                if (diceSum >= 11) {
                    System.out.println(" (High)");
                } else {
                    System.out.println(" (Low)");
                }
                gamePlay[currentInput] = highOrLow;
            }

            if ((highOrLow.equals("h")) && diceSum >= 11) {
                gameResult[currentInput] = "You won 20 baht!";
                System.out.println(gameResult[currentInput]);
                currentInput++;
            } else if ((highOrLow.equals("l")) && diceSum < 11) {
                gameResult[currentInput] = "You won 20 baht!";
                System.out.println(gameResult[currentInput]);
                currentInput++;
            } else if ((highOrLow.equals("h")) && diceSum < 11) {
                gameResult[currentInput] = "You lost 10 baht!";
                System.out.println(gameResult[currentInput]);
                currentInput++;
            } else if ((highOrLow.equals("l")) && diceSum >= 11) {
                gameResult[currentInput] = "You lost 10 baht!";
                System.out.println(gameResult[currentInput]);
                currentInput++;
            } else {
                System.out.println(invalidInput + " ('h' for high, 'l' for low only!)");
                playGame();
            }
        }

        if (choice == 2) {
            int matchedDice = 0;
            String[] diceRange = { "1", "2", "3", "4", "5", "6" };
            System.out.print("Pick a number between 1 to 6: ");
            String pickNumber = userInput.next();

            if (Arrays.asList(diceRange).contains(pickNumber)) {
                System.out.println(eachDice);
                gamePlay[currentInput] = pickNumber;

                if (pickNumber.equals(Integer.toString(dice1))) {
                    matchedDice++;
                }
                if (pickNumber.equals(Integer.toString(dice2))) {
                    matchedDice++;
                }
                if (pickNumber.equals(Integer.toString(dice3))) {
                    matchedDice++;
                }

                if (matchedDice == 0) {
                    gameResult[currentInput] = "You lost 10 baht!";
                    System.out.println(gameResult[currentInput]);
                    currentInput++;
                    
                } else {
                    gameResult[currentInput] = "You won " + rewardCalc(matchedDice) + " baht!";
                    System.out.println(gameResult[currentInput]);
                    currentInput++;
                }
            } else {
                System.out.println(invalidInput + " (Enter a number between 1 to 6 only!)");
                playGame();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to ศิรัสพล แสงนาค (653040462-9)'s game!");
            getChoice();
            playGame();
            System.out.println("Type 'A' to play again. Type other letter to exit.");
            String playAgain = userInput.next().toLowerCase();
            if (playAgain.equals("a") == false) {
                System.out.println("### Game Play Summary ###");
                for (int gameCount = 0; gameCount < currentInput; gameCount++) {
                    System.out.println("Game " + gameCount + ":");
                    System.out.println("You have bet on '" + gamePlay[gameCount] + "'.");
                    System.out.println(gameResult[gameCount]);
                }
                System.out.println("Thanks for playing. Goodbye!");
                userInput.close();
                System.exit(0);
            }
        }
    }
}

/*
 * This program 'SicBoV4' is a dice game with a variety of possible bets
 * that based on the points of 3 dice. Each bets has its own payout odds.
 * This program provides 2 ways of playing:
 * 1. choosing high number or low number of dice points.
 * - High: 11-18 points
 * - Low: 3-10 points
 * if the player guess correctly, they win double of the money they put on the
 * bet.
 * 2. picking a number between 1 to 6: Players can bet on specific number they
 * desire, with the payout depending on how many dice match the number.
 * 
 * 'SicBoV4' is adapted from the previous program 'SicBoV3', with
 * an additional feature; display the game play summary, which contains the 
 * value of the player's bet, and result(s) of each game at the end of the program.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 10, 2023
 */