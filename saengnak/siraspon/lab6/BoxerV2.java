package saengnak.siraspon.lab6;

class BoxerV2 extends AthleteV2 {
    BoxerV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    @Override
    void practice() {
        super.practice();
        System.out.println(", and swings arms.");
    }
}
