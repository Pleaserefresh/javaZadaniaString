package com.company;

import java.util.Scanner;

public class zad8string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter word, only last two letters will be printed: ");
        String word = scanner.next();
        System.out.println(word.substring(word.length()-2));
    }
}
