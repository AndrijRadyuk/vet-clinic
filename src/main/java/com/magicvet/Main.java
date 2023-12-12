package main.java.com.magicvet;

import main.java.com.magicvet.component.ApllicationRunner;

import java.util.Scanner;

public class Main {

    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        ApllicationRunner runner = new ApllicationRunner();
        runner.run();
    }

}