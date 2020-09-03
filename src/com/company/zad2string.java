package com.company;

import java.util.Scanner;

public class zad2string {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = skaner.nextLine().toLowerCase();
        if (name.endsWith("a") && !name.equals("barnaba")) {
            System.out.println("imię żeńskie");
        } else {
            System.out.println("imię męskie");
        }
    }
}
