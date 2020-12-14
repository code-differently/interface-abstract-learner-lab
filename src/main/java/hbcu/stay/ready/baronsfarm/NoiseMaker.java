package hbcu.stay.ready.baronsfarm;

public interface NoiseMaker {

    default String makeNoise() {
        String noise = "Make noise";

        return noise;
    }
}
