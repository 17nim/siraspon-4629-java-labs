package saengnak.siraspon.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Athlete {
    protected String name, nationality, birthdate;
    protected double weight, height;
    protected Gender gender;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
        this.birthdate = birthdate;
    }

    void setName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }

    void setWeight(double newWeight) {
        weight = newWeight;
    }

    double getWeight() {
        return weight;
    }

    void setHeight(double newHeight) {
        height = newHeight;
    }

    double getHeight() {
        return height;
    }

    void setGender(Gender newGender) {
        gender = newGender;
    }

    Gender getGender() {
        return gender;
    }

    void setNationality(String newNationality) {
        nationality = newNationality;
    }

    String getNationality() {
        return nationality;
    }

    void setBirthdate(String newBirthdate) {
        birthdate = newBirthdate;
    }

    LocalDate getBirthdate() {
        return LocalDate.parse(birthdate, formatter);
    }

    void compareAge(Athlete athleteB) {
        LocalDate dateBefore = this.getBirthdate();
        LocalDate dateAfter = athleteB.getBirthdate();
        int yearsGap = (int) ChronoUnit.YEARS.between(dateBefore, dateAfter);
        if (yearsGap < 0) {
            System.out.println(
                    athleteB.getName() + " is " + (yearsGap * -1) + " years older than " + this.getName() + ".");
        } else if (yearsGap > 0) {
            System.out.println(athleteB.getName() + " is " + yearsGap + " years younger than " + this.getName() + ".");
        } else {
            System.out.println(athleteB.getName() + " is as old as " + this.getName() + ".");
        }
    }

    public String toString() {
        return "Athlete [" + name + ", " + weight + " kg, " + height + " m, " + gender + ", " + nationality
                + ", " + getBirthdate() + "]";
    }
}

enum Gender {
    MALE, FEMALE
}

public class WorldAthlete {
    public static void main(String[] args) {
        Athlete kento = new Athlete("Kento Momota", 68, 1.75, Gender.MALE, "Japanese", "01/09/1994");
        System.out.println(kento.getName() + "'s height is " + kento.getHeight() + " m.");
        kento.setHeight(1.7526);
        System.out.println(kento.getName() + "'s height has increased to " + kento.getHeight() + " m.");
        System.out.println(kento);

        Athlete axelsen = new Athlete("Viktor Axelsen", 85, 1.92, Gender.MALE, "Danish", "04/01/1994");
        System.out.println(axelsen);

        Athlete sungjihyun = new Athlete("Sung Ji-Hyun", 64, 1.72, Gender.FEMALE, "Korean", "03/01/1989");
        System.out.println(sungjihyun);

        axelsen.compareAge(sungjihyun);
        kento.compareAge(axelsen);
        sungjihyun.compareAge(kento);
    }
}
