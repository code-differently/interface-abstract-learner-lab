package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class TomatoPlant extends Crop {

    private ArrayList<Crop> tomato;

    public TomatoPlant(ArrayList<Edible> tomatoIn) {
        super(tomatoIn);
    }

    public Edible yield(ArrayList<Edible> juicyTomatoes, boolean hasBeenHarvested, boolean hasBeenFertilized) {
        Edible edible = new Edible(juicyTomatoes);

        return edible;
    }
}
