package main.java.com.magicvet.comparator;

import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Comparator;

public class DogNameComperator implements Comparator<Pet> {

    @Override
    public int compare(Pet dog1, Pet dog2) {
        return dog1.toString().compareTo(dog2.toString());
    }


}
