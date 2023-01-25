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
