package saengnak.siraspon.lab3;

import java.util.Scanner;
import java.util.Arrays;

public class SicBo {

    static int dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
    static int dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
    static int dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
    static int diceSum = dice1 + dice2 + dice3;

    static String eachDice = "Dice 1: " + dice1 + ", Dice 2: " + dice2 + ", Dice 3: " + dice3;
    static String diceTotal = "Total = " + diceSum;
    static String invalidInput = "Please enter a valid input.";
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose how do you want to bet");
        System.out.println("Type '1': Choosing between high or low number.");
        System.out.println("Type '2': Picking a number between 1 to 6.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = userInput.next();

        if (choice.equals("1")) {
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
            }

            if ((highOrLow.equals("h")) && diceSum >= 11) {
                System.out.println("You won 20 baht!");
            } else if ((highOrLow.equals("l")) && diceSum < 11) {
                System.out.println("You won 20 baht!");
            } else if ((highOrLow.equals("h")) && diceSum < 11) {
                System.out.println("You lost 10 baht!");
            } else if ((highOrLow.equals("l")) && diceSum >= 11) {
                System.out.println("You lost 10 baht!");
            } else {
                System.out.print(invalidInput + " ('h' for high, 'l' for low)");
            }

        } else if (choice.equals("2")) {
            int betMoney = 0;
            String[] diceRange = { "1", "2", "3", "4", "5", "6" };
            System.out.print("Pick a number between 1 to 6: ");
            String pickNumber = userInput.next();

            if (Arrays.asList(diceRange).contains(pickNumber)) {
                System.out.println(eachDice);

                if (pickNumber.equals(Integer.toString(dice1))) {
                    betMoney += 30;
                }
                if (pickNumber.equals(Integer.toString(dice2))) {
                    betMoney += 30;
                }
                if (pickNumber.equals(Integer.toString(dice3))) {
                    betMoney += 30;
                }

                if (betMoney < 30) {
                    System.out.println("You lost 10 baht!");
                } else {
                    System.out.println("You won " + betMoney + " baht!");
                }
            } else {
                System.out.print(invalidInput + " (Enter a number between 1 to 6 only!)");
            }
        } else {
            System.out.print(invalidInput + " (Enter 1 or 2 only!)");
        }
        userInput.close();
    }
}

/*
 * This program 'SicBo' is a dice game with a variety of possible bets
 * that based on the points of 3 dice. Each bets has its own payout odds. 
 * This program provides 2 ways of playing:
 * 1. choosing high number or low number of dice points.
 *      - High: 11-18 points
 *      - Low: 3-10 points
 *      if the player guess correctly, they win double of the money they put on the bet.
 * 2. picking a number between 1 to 6: Players can bet on specific number they desire,
 *      with the payout depending on how many dice show the number.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: December 22, 2022
 */