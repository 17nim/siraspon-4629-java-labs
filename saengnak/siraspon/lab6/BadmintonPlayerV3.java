package saengnak.siraspon.lab6;

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements BadmintonPlayable, Sprinter {
    protected double racketLength, speed;
    protected int worldRanking;

    BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    public void setRacketLength(double newRacketLength) {
        racketLength = newRacketLength;
    }

    public double getRacketLength() {
        return racketLength;
    }

    public void setWorldRanking(int newWorldRanking) {
        worldRanking = newWorldRanking;
    }

    public int getWorldRanking() {
        return worldRanking;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public String toString() {
        return name + " is a Badminton player whose world ranking is " + getWorldRanking() + ", and has sprint speed as "
                + getSpeed();
    }
}

/*
 * This class 'BadmintonPlayerV3' is a subclass that is extended from the class
 * 'BadmintonPlayerV2' and implements two interfaces: BadmintonPlayable and Sprinter.
 * This class contains three attributes: racketLength, worldRanking, and speed.
 * It also overrides setter and getter methods for those attributes.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */