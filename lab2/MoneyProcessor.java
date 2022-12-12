package saengnak.siraspon.lab2;

public class MoneyProcessor {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("java MoneyProcessor <thousandNote> <fiveHundredNote> <oneHundredNote> <twentyNote>");
            System.exit(0);
        }
        int thousandNote = Integer.parseInt(args[0]);
        int fiveHundredNote = Integer.parseInt(args[1]);
        int oneHundredNote = Integer.parseInt(args[2]);
        int twentyNote = Integer.parseInt(args[3]);
        int total = (thousandNote * 1000) + (fiveHundredNote * 500) + (oneHundredNote * 100) + (twentyNote * 20);
        System.out.println("Total money is " + total + " baht.");

    }
}

/**
 * This program 'MoneyProcessor' calculates total money
 * using 4 arguments; number of thousand baht banknotes,
 * five hundred baht banknotes, one hundred baht banknotes,
 * and twenty baht banknotes. Then declares the calculated
 * amount of money as variable <total>.
 * 
 * The output format is "Total money is <total> baht."
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: December 12, 2022
 **/