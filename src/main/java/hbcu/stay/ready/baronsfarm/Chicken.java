package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken(String nameIn) {
        super(nameIn);
    }

    public EdibleEgg yield(ArrayList<Edible> egg, boolean hasBeenFertilized) {
       EdibleEgg goodEgg = new EdibleEgg(egg);

       return goodEgg;
    }
}
