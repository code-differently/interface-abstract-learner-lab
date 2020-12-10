package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class ChickenCoop {

    private String chickenCoopID;
    private ArrayList<Chicken> chickenList;

    public ChickenCoop(String nameIn, ArrayList<Chicken> arrayListIn) {
        this.chickenCoopID = nameIn;
        this.chickenList = arrayListIn;
    }

    public String getChickenCoopID() {
        return chickenCoopID;
    }

    public void setChickenCoopID(String chickenCoopID) {
        this.chickenCoopID = chickenCoopID;
    }

    public void addChicken(Chicken nameIn) {
        chickenList.add(nameIn);
    }

    public ArrayList<Chicken> getChickenList() {
        return chickenList;
    }
}
