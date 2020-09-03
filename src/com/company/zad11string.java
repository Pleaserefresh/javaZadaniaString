package com.company;

import java.util.Scanner;

public class zad11string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentences to make it lowercase: ");
        String sentence = scanner.nextLine().toLowerCase();
        System.out.println(sentence);
    }
}
