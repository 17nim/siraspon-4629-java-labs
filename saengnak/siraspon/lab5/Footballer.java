package saengnak.siraspon.lab5;

class Footballer extends Athlete {
    private static String sport = "American Football";
    private String position, team;

    Footballer(String name, double weight, double height, Gender gender, String nationality, String birthdate,
            String position, String team) {
        super(name, weight, height, gender, nationality, birthdate);
        this.position = position;
        this.team = team;
    }

    void setPosition(String newPosition) {
        position = newPosition;
    }

    String getPosition() {
        return position;
    }

    void setTeam(String newTeam) {
        team = newTeam;
    }

    String getTeam() {
        return team;
    }

    public String toString() {
        return super.toString() + ", " + sport + ", " + position + ", " + team;
    }
}

/*
 * This class 'Footballer' is a subclass that is extended from
 * the class 'Athlete'. This class includes 3 additional attributes;
 * sport = "American Football", position, and team.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 19, 2023
 */