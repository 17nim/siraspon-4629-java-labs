import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class SicBo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose how do you want to bet");
        System.out.println("Type '1': Choosing between high or low number.");
        System.out.println("Type '2': Choosing a number between 1-6.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = s.next();

        int dice1, dice2, dice3, diceTotal;
        dice1 = 1 + (int) (Math.random() * ((6 - 1) + 1));
        dice2 = 1 + (int) (Math.random() * ((6 - 1) + 1));
        dice3 = 1 + (int) (Math.random() * ((6 - 1) + 1));
        diceTotal = dice1 + dice2 + dice3;

        if (choice.equals("1")) {
            System.out.print("Type 'h' for high, 'l' for low: ");
            String highOrLow = s.next().toLowerCase();

            if (highOrLow.equals("h") || highOrLow.equals("l")) {
                System.out.println("Dice 1: " + dice1 + ", Dice 2: " + dice2 + ", Dice 3: " + dice3);
                System.out.print("Total = " + diceTotal);
                if (diceTotal >= 11) {
                    System.out.println(" (High)");
                } else {
                    System.out.println(" (Low)");
                }
            }

            if ((highOrLow.equals("h")) && diceTotal >= 11) {
                System.out.println("You won 20 baht!");
            } else if ((highOrLow.equals("l")) && diceTotal < 11) {
                System.out.println("You won 20 baht!");
            } else if ((highOrLow.equals("h")) && diceTotal < 11) {
                System.out.println("You lost 10 baht!");
            } else if ((highOrLow.equals("l")) && diceTotal >= 11) {
                System.out.println("You lost 10 baht!");
            } else {
                System.out.print("Please enter a valid input.");
            }

        } else if (choice.equals("2")) {
            int betMoney = 0;
            String[] diceRange = { "1", "2", "3", "4", "5", "6" };
            System.out.print("Pick a number between 1 to 6: ");
            String pickNumber = s.next();

            if (Arrays.asList(diceRange).contains(pickNumber)) {
                System.out.println("Dice 1: " + dice1 + ", Dice 2: " + dice2 + ", Dice 3: " + dice3);

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
                    System.out.println("You lose 10 baht!");
                } else {
                    System.out.println("You won " + betMoney + " baht!");
                }
            } else {
                System.out.print("Please enter a valid input.");
            }
        } else {
            System.out.print("Please enter a valid input.");
        }
        s.close();
    }
}