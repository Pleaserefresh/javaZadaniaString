package com.company;

import java.util.Scanner;

public class zad9string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence to check if there is some cat in it: ");
        String sentence = scanner.nextLine().toLowerCase();
        System.out.println(sentence.contains("cat"));


    }
}
