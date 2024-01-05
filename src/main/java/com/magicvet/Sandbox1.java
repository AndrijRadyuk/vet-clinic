package main.java.com.magicvet;

import main.java.com.magicvet.comparator.DogNameComperator;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;

public class Sandbox1 {
    public static void main(String[] args) {
        Pet[] petName = {
                new Pet(Pet.Name2),
                new Pet(Pet.Name1),
                new Pet(Pet.Name3),

        };
        Arrays.sort(petName, new DogNameComperator());
        for (Pet dog : petName){
            System.out.println(dog);

        }
    }
}
