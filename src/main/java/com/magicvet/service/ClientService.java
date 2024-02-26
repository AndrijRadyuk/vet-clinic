package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;

import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {

    private static final String EMAIL_Pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private static final String NAME_Pattern = ".[a-zA-Z-]{2,}$";


    public Optional<Client> registerNewClient() {
        Client client = null;

        System.out.println("Please provide client details");
        System.out.print("Email: ");
        String email= Main.SCANNER.nextLine();
        if (isEmailValid(email)){
            client = buildClient(email);
            if (client!=null) {
                System.out.println("New client: " + client.getFirstName() + " "
                        + client.getLastName() + " (" + client.getEmail() + ") " + client.getRegistrationDate());
            }
        }else {
            System.out.println("Provide client is invalid.");

        }
        return Optional.ofNullable(client);
    }
    private static Client buildClient(String email) {
        Client client = new Client();
        client.setEmail(email);


        System.out.print("First name: ");
        client.setFirstName(Main.SCANNER.nextLine());
        if (isNameValid(client.getFirstName())){


        }else {
            System.out.println("Provide first name client is invalid.");
            return null;
        }
        System.out.print("Last name: ");
        client.setLastName(Main.SCANNER.nextLine());

        if (isLastValid(client.getLastName())){

        }else {
            System.out.println("Provide last name client is invalid.");
            return null;
        }

        System.out.print("Location: ");

        Client.Location location;
        String locationInput = Main.SCANNER.nextLine();
        try {
            location = Client.Location.valueOf(locationInput);
        } catch (IllegalArgumentException e) {
            location = Client.Location.UNKNOWN;
            System.out.println("Unable to parse value '" + locationInput
                    + "'. Using default value:" + Client.Location.UNKNOWN);
        }
        client.setLocation(location);



        return (client);
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_Pattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private static boolean isNameValid(String firstName) {
        Pattern pattern = Pattern.compile(NAME_Pattern);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    private static boolean isLastValid(String lastName) {
        Pattern pattern = Pattern.compile(NAME_Pattern);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
