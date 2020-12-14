package hbcu.stay.ready.baronsfarm;

public interface Eater {

    default String eat() {
        String eats = "Chomp Chomp";

        return eats;
    }
}
