package com.company;

import java.util.Scanner;

public class zad13string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to check if it end with \"tka\":");
        String word = scanner.next();
        System.out.println(word.endsWith("tka"));
    }
}
