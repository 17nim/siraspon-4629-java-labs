package saengnak.siraspon.lab6;

class AthleteV2 extends saengnak.siraspon.lab5.Athlete {
    AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    void practice() {
        System.out.print(name + " runs for 10 km");
    }
}

/*
 * This class 'AthleteV2' is a subclass that is extended from the class
 * 'Athlete'. This class includes an additional method called practice(), which
 * display the name of an athlete and their practice routine.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */