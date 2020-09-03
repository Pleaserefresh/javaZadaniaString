package com.company;

import java.util.Scanner;

public class zad12string {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence with * to cut it: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence.replace("*", ""));
    }
}