package com.company;

import java.util.Scanner;

public class zad3string {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        //wyraz 1
        System.out.print("Podaj wyraz 1: ");
        String word1 =  skaner.next();
        //wyraz 2
        System.out.print("Podaj wyraz 2: ");
        String word2 = skaner.next();
        //odwrócenie kolejności wyrazów
        StringBuilder sentence = new StringBuilder(word2 + " " + word1);
        System.out.println(sentence);
    }
}
