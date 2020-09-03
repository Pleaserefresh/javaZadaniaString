package com.company;

import java.util.Scanner;

public class zad4string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String sentence = scanner.nextLine().toLowerCase();
        if (sentence.contains("kot")) {
            System.out.println("Zdanie zawiera wyraz kot");
        } else {
            System.out.println("Zdanie nie zawiera wyrazu kot");
        }
    }
}
