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

/*
 * This class 'BoxerV2' is a subclass that is extended from the class
 * 'AthleteV2'. This class includes an overridden method practice(), which
 * display the name of a Boxer and their practice routine.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */