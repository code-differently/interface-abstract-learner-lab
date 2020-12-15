package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class CornStalk extends Crop {

    private ArrayList<Crop> cornStalk;

    public CornStalk(ArrayList<Edible> cornIn) {
        super(cornIn);
    }

    public Edible yield(ArrayList<Edible> juicyTomatoes, boolean hasBeenHarvested, boolean hasBeenFertilized) {
        Edible edible = new Edible(juicyTomatoes);

        return edible;
    }
}
