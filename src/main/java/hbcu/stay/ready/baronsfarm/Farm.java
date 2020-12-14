package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private final FarmHouse farmHouse;

    public Farm(FarmHouse houseIn, ArrayList<Stable> arrayListStable, ArrayList<ChickenCoop> arrayListCoop) {
        this.farmHouse = houseIn;
        this.stables = arrayListStable;
        this.chickenCoops = arrayListCoop;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public ArrayList<Stable> addStables() {
        ArrayList<Stable> newStable = new ArrayList<>();

        return newStable;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<ChickenCoop> addCoops() {
        ArrayList<ChickenCoop> newCoop = new ArrayList<>();

        return newCoop;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
