package hbcu.stay.ready.baronsfarm;

public class Person implements NoiseMaker, Eater {

    private String name;

    public Person(String nameIn) {
        this.name = nameIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }
}