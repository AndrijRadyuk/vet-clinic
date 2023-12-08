package main.java.com.magicvet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static String Password = "default";
    static Scanner SCANNER = new Scanner(System.in);

    static String EMAIL_Pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    static String NAME_Pattern = ".[a-zA-Z-]{3,}$";

    public static void main(String[] args) {
        run();
    }

    static void run() {
        if (auth()){
            registerNewClient();
        }

    }

    static boolean auth() {
        boolean accepted = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if (Password.equals(input)) {
                accepted = true;
                break;

            } else {
                System.out.println("Access denied. Please check your password");
            }
        }
        System.out.println(accepted ? "Welcome to the Magic Vet!" : "Aplication has beeb blocked");

        return accepted;
    }
    static void registerNewClient() {
        System.out.println("Please provide client details");
        System.out.print("Email: ");
        String email=SCANNER.nextLine();
        if (isEmailValid(email)){
            Client client = buildClient(email);
            if (client!=null) {
                System.out.println("New client: " + client.firstName + " " + client.lastName + " (" + client.email + ")");
            }
        }else {
            System.out.println("Provide client is invalid.");

        }
    }

    static Client buildClient(String email) {
        Client client = new Client();
        client.email = email;


        System.out.print("First name: ");
        client.firstName = SCANNER.nextLine();
        if (isNameValid(client.firstName)){


        }else {
            System.out.println("Provide first name client is invalid.");
            return null;
        }
        System.out.print("Last name: ");
        client.lastName = SCANNER.nextLine();

        if (isLastValid(client.lastName)){

        }else {
            System.out.println("Provide last name client is invalid.");
            return null;
        }



        return (client);
    }

    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_Pattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    static boolean isNameValid(String firstName) {
        Pattern pattern = Pattern.compile(NAME_Pattern);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    static boolean isLastValid(String lastName) {
        Pattern pattern = Pattern.compile(NAME_Pattern);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}