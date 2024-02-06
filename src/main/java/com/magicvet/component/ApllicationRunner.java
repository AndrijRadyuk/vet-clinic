package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.PetService;
import main.java.com.magicvet.service.ClientService;

public class ApllicationRunner {

    private final EntityRegistr registr = new EntityRegistr();



    public void run() {
        if (Authenticator.auth()){
            registr.registerClients();
        }
    }
}
