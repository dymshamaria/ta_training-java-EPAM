package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.valueOf(scanner.nextLine());
        if (amount < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if ((amount == 0)) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            for (int i = 0; i < amount; i++) System.out.println("Hello, " + scanner.nextLine());
        }
    }
}
