package com.company;

import java.util.Scanner;

public class zad6string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input sentence to modify
        System.out.print("Podaj zdanie do modyfikacji: ");
        String sentence = scanner.nextLine();

        // prints modified sentence
        System.out.println(sentence.substring(1, sentence.length()-1));
    }
}
