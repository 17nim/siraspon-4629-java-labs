package saengnak.siraspon.lab6;

import java.util.ArrayList;

public abstract class Competition {
    protected String name, region;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setRegion(String newRegion) {
        region = newRegion;
    }

    public String getRegion() {
        return region;
    }

    abstract void setDescription();

    abstract void setSponsorship(ArrayList<String> sponsors);
}

/*
 * This class 'Competition' contains two attributes called name and region,
 * the setter and getter methods of these attributes, and two abstract methods
 * setDescription() and setSponsorship().
 *
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */