package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.PetService;
import main.java.com.magicvet.service.ClientService;

public class ApllicationRunner {

    private final ClientService clientService = new ClientService();

    private final PetService petService = new PetService();

    public void run() {
        if (Authenticator.auth()){
            Client client = clientService.registerNewClient();

            if (client != null) {
                System.out.println("Do you want add a new pet? (y/n)");
                if (Main.SCANNER.nextLine().equals("y")) {
                    System.out.println("Add a new pet.");

                    Pet pet = petService.registerNewPet();
                    client.setPet(pet);
                    pet.setOwnerName(client.getFirstName() + " " + client.getLastName());

                    System.out.println("Pet has been added");

                    System.out.println(client);
                }
            }

        }

    }
}
