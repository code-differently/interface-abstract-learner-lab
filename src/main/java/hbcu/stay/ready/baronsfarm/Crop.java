package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Crop implements Produce {

    private final ArrayList<Crop> cropRow;
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop(ArrayList<Crop> cropIn) {
        this.cropRow = cropIn;
    }

    public ArrayList<Crop> getCropRow() {
        return cropRow;
    }
}
