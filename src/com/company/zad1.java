package com.company;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj wyraz: ");
        String word = skaner.nextLine();
        System.out.println(word.charAt(0));
    }
}
