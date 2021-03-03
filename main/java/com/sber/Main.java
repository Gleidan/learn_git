package com.sber;

import java.util.Scanner;

public class Main {

    private static String userName;
    private static int age;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ageChecking();
    }

    public static void ageChecking() {
        System.out.println("Please, enter your age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Sorry, this site only for adult people");
        }
    }
}
