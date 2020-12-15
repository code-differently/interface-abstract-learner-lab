package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Crop implements Produce {

    private final ArrayList<Edible> cropRow;
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop(ArrayList<Edible> cropIn) {
        this.cropRow = cropIn;
    }

    public ArrayList<Edible> getCropRow() {
        return cropRow;
    }
}
