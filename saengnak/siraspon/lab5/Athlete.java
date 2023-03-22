package saengnak.siraspon.lab5;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Athlete implements Serializable {
    public enum Gender {
        MALE, FEMALE
    }

    protected String name, nationality, birthdate;
    protected double weight, height;
    protected Gender gender;

    public DateTimeFormatter formatter;

    public Athlete() {
        return;
    }

    public Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
        this.birthdate = birthdate;
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getHeight() {
        return height;
    }

    public void setGender(Gender newGender) {
        gender = newGender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setNationality(String newNationality) {
        nationality = newNationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setBirthdate(String newBirthdate) {
        birthdate = newBirthdate;
    }

    public LocalDate getBirthdate() {
        return LocalDate.parse(birthdate, formatter);
    }

    public void compareAge(Athlete athleteB) {
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
