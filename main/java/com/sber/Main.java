package com.sber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        helloUser();
        System.out.println("Good bye!");
    }

    public static void helloUser() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please, Enter your name:");
            String name = bufferedReader.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
