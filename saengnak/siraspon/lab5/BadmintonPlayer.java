package saengnak.siraspon.lab5;

class BadmintonPlayer extends Athlete {
    private static String sport = "Badminton";
    private double racketLength;
    private int worldRanking;

    BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality, String birthdate,
            double racketLength, int worldRanking) {
        super(name, weight, height, gender, nationality, birthdate);
        this.racketLength = racketLength;
        this.worldRanking = worldRanking;
    }

    void setRacketLength(double newRacketLength) {
        racketLength = newRacketLength;
    }

    double getRacketLength() {
        return racketLength;
    }

    void setWorldRanking(int newWorldRanking) {
        worldRanking = newWorldRanking;
    }

    int getWorldRanking() {
        return worldRanking;
    }

    public String toString() {
        return super.toString() + ", " + sport + ", " + racketLength / 10 + " cm, rank: " + worldRanking;
    }
}

/*
 * This class 'BadmintonPlayer' is a subclass that is extended from
 * the class 'Athlete'. This class includes 3 additional attributes;
 * sport = "Badminton", racketLength, and worldRanking.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 19, 2023
 */