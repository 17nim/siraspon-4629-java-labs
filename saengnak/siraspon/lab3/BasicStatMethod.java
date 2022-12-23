package saengnak.siraspon.lab3;

import java.util.Scanner;
import java.util.Arrays;

public class BasicStatMethod {

    static String getInput() {
        Scanner numbersInput = new Scanner(System.in);
        System.out.print("Enter numbers (seperate by space): ");
        String userInput = numbersInput.nextLine();

        if (userInput.isEmpty()) {
            System.out.println("Please enter at least one number.");
            System.exit(0);
        }

        return userInput;
    }

    static void calculateStat(String numberList) {
        String[] stringNumbersArray = numberList.split(" ");
        Double[] doubleNumbersArray = new Double[stringNumbersArray.length];

        double sum = 0;
        for (int i = 0; i < stringNumbersArray.length; i++) {
            doubleNumbersArray[i] = Double.parseDouble(stringNumbersArray[i]);
            sum += doubleNumbersArray[i];
        }
        Arrays.sort(doubleNumbersArray);
        int len = doubleNumbersArray.length;

        double median = 0;
        if (len % 2 == 0) {
            median = (doubleNumbersArray[len / 2] + doubleNumbersArray[(len / 2) - 1]) / 2;
        } else {
            median = doubleNumbersArray[len / 2];
        }

        double minimum = doubleNumbersArray[0];
        double maximum = doubleNumbersArray[len - 1];
        double average = sum / len;

        double sumForSD = 0;
        for (int i = 0; i < len; i++) {
            sumForSD += Math.pow(doubleNumbersArray[i] - average, 2);
        }
        double standardDeviation = Math.sqrt(sumForSD / len);

        System.out.print("Sorted numbers: ");
        for (int i = 0; i < len; i++) {
            System.out.print(doubleNumbersArray[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Minimum: " + String.format("%,.2f", minimum));
        System.out.println("Maximum: " + String.format("%,.2f", maximum));
        System.out.println("Average: " + String.format("%,.2f", average));
        System.out.println("Median: " + String.format("%,.2f", median));
        System.out.println("Standard Deviation: " + String.format("%,.2f", standardDeviation));
    }

    public static void main(String[] args) {
        String input = getInput();
        calculateStat(input);
    }
}

/*
 * This program 'BasicStatMethod' collects list of numbers that are seperated by
 * space,
 * sort them in ascending order, and calculates the minimum, maximum, average
 * (mean),
 * median, and standard deviation. The output results are in two decimal places.
 * 
 * 'BasicStatMethod' is adapted from the previous program 'BasicStat', with
 * additional
 * usage of 2 methods, getInput(), and calculateStat().
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: December 22, 2022
 */