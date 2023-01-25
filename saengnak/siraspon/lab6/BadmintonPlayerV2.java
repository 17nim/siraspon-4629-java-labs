package saengnak.siraspon.lab6;

class BadmintonPlayerV2 extends AthleteV2 {
    BadmintonPlayerV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    @Override
    void practice() {
        super.practice();
        System.out.println(", and plays half court singles.");
    }
}
