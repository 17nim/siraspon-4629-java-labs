package saengnak.siraspon.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Athlete {
    public enum Gender {
        MALE, FEMALE
    }

    protected String name, nationality, birthdate;
    protected double weight, height;
    protected Gender gender;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
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
        return name + ", " + weight + " kg, " + height + " m, " + gender + ", " + nationality + ", " + getBirthdate();
    }
}
