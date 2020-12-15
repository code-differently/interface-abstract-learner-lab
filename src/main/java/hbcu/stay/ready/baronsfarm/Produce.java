package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public interface Produce {

    default EdibleEgg yield(ArrayList<Edible> egg, boolean hasBeenFertilized) {
        EdibleEgg egg1 = new EdibleEgg(egg);

        return egg1;
    }

    default Edible yield(ArrayList<Edible> crop, boolean hasBeenHarvested, boolean hasBeenFertilized) {
        Edible edible = new Edible(crop);

        return edible;
    }
}
