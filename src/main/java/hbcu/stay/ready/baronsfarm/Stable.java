package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Stable {

    private String stableID;
    private ArrayList<Horse> horseList;

    public Stable(String nameIn, ArrayList<Horse> arrayListIn) {
        this.stableID = nameIn;
        this.horseList = arrayListIn;
    }

    public String getStableID() {
        return stableID;
    }

    public void setStableID(String stableID) {
        this.stableID = stableID;
    }

    public void addHorse(Horse nameIn) {
        horseList.add(nameIn);
    }

    public ArrayList<Horse> getHorseList() {
        return horseList;
    }
}
