package saengnak.siraspon.lab6;

class AthleteV2 extends saengnak.siraspon.lab5.Athlete {
    AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    void practice() {
        System.out.print(name + " runs for 10 km");
    }
}
