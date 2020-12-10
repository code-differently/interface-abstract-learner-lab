package hbcu.stay.ready.baronsfarm;

public interface Rideable {

    default void mount(Rider riderIn) {

    }

    default String dismount() {
        String name = "Rider";

        return name;
    }
}
