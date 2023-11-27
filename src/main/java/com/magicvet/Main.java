package main.java.com.magicvet;

import java.util.Scanner;

public class Main {

    static String Password = "default";
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }
    static void run(){
        boolean accepted = false;
        for (int i =0; i < 3; i++){
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if (Password.equals(input)) {
                accepted=true;
                break;

            }else {
                System.out.println("Access denied. Please check your password");
            }
        }
        System.out.println(accepted ? "Welcome to the Magic Vet!" : "Aplication has beeb blocked");
    }
}