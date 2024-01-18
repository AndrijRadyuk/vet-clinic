package main.java.com.magicvet;
import main.java.com.magicvet.model.Pet;
import java.util.Arrays;
import java.util.Comparator;

public class Sandbox2 {

    public static void main(String[] args) {
        Pet[] pets = {
                new Pet(Pet.Health.bad),
                new Pet(Pet.Health.good),
                new Pet(Pet.Health.bad),
                new Pet(Pet.Health.nice),
        };
        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.health().getValue() - o2.health().getValue();
            }
        });
        for (Pet pet : pets){
            System.out.println(pet.health());
        }
    }
}
