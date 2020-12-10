package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class FarmHouse {

    private String houseName;
    private ArrayList<Person> personList;

    public FarmHouse(String nameIn, ArrayList<Person> arrayListIn) {
        this.houseName = nameIn;
        this.personList = arrayListIn;
    }

    public String getHouseName() {
        return houseName;
    }

    public void addPerson(Person nameIn) {
        personList.add(nameIn);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
