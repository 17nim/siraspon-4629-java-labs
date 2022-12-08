public class Footballer {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("java Footballer <name> <nationality> <club>");
            System.exit(0);
        }
        String name = args[0];
        String nationality = args[1];
        String club = args[2];
        System.out.println("My favorite football player is " + name + ".");
        System.out.println("His nationality is " + nationality + ".");
        System.out.println("He plays for " + club + ".");
    }
}