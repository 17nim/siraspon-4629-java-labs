package saengnak.siraspon.lab5;

class Boxer extends Athlete {
    private static String sport = "Boxing";
    private String division, gloveSize;

    Boxer(String name, double weight, double height, Gender gender, String nationality, String birthdate,
            String division, String gloveSize) {
        super(name, weight, height, gender, nationality, birthdate);
        this.division = division;
        this.gloveSize = gloveSize;
    }

    void setDivision(String newDivision) {
        division = newDivision;
    }

    String getDivision() {
        return division;
    }

    void setGloveSize(String newGloveSize) {
        gloveSize = newGloveSize;
    }

    String getGloveSize() {
        return gloveSize;
    }

    public String toString() {
        return super.toString() + ", " + sport + ", " + division + ", " + gloveSize;
    }
}

/*
 * This class 'Boxer' is a subclass that is extended from
 * the class 'Athlete'. This class includes 3 additional attributes;
 * sport = "Boxing", division, and gloveSize.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 19, 2023
 */