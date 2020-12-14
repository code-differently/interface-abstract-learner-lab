package hbcu.stay.ready.baronsfarm;

public interface Aircraft {

    default String fly() {
        String flyer = "up up and away";

        return flyer;
    }

    default String fertilize() {
        String fertilizer = "fertilized";

        return fertilizer;
    }
}
