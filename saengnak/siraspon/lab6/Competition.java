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
