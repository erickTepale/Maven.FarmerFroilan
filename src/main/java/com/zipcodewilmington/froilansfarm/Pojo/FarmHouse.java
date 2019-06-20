package com.zipcodewilmington.froilansfarm.Pojo;

import java.util.ArrayList;
import java.util.List;

//singleton
public class FarmHouse {
    //stores many persons
    private static FarmHouse FARMHOUSE = new FarmHouse();
    private List<Person> residents;

    private FarmHouse(){
        residents = new ArrayList<Person>();
        residents.add(new Farmer());
        residents.add(new Pilot());
    }

    public void addPerson(Person person){
        residents.add(person);
    }

    public Integer getCount(){
        return residents.size();
    }

    public Person getPerson(Person a){
        for (Person each : residents) {
            if (each.equals(a))
                return each;
        }
        return null;
    }

    public ArrayList<Person> getList(){
        return (ArrayList<Person>) residents;
    }

    public static FarmHouse getInstance(){
        return FARMHOUSE;
    }
}
