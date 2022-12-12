package saengnak.siraspon.lab2;

public class StringAPI {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java StringAPI <schoolName>");
            System.exit(0);
        }
        String schoolName = args[0];
        String schoolNameLowerCase = schoolName.toLowerCase();
        int indexCollege = schoolNameLowerCase.indexOf("college");
        int indexUniversity = schoolNameLowerCase.indexOf("university");
        if (indexCollege != -1) {
            System.out.println(schoolName + " is a college.");
        } else if (indexUniversity != -1) {
            System.out.println(schoolName + " is a university.");
        } else {
            System.out.println(schoolName + " is not a college nor a university.");
        }
    }
}