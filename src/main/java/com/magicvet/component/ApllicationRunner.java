package main.java.com.magicvet.component;

import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.model.PetService;
import main.java.com.magicvet.service.ClientService;

public class ApllicationRunner {

    private ClientService clientService = new ClientService();

    private PetService petService = new PetService();

    public void run() {
        if (Authenticator.auth()){
            Client client = clientService.registerNewClient();

            if (client != null) {
                System.out.println("Add a new pet.");

                Pet pet = petService.registerNewPet();
                client.setPet(pet);
                pet.setOwnerName(client.getFirstName() + " " + client.getLastName());

                System.out.println("Pet has been added");
            }
        }

    }
}
