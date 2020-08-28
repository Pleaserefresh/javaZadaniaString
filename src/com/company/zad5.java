package com.company;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kod pocztowy: ");
        String postcode = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(postcode);
        // insert str "-" at offset 2
        stringBuilder.insert(2, "-");
        // print postcode after insertion
        System.out.println(stringBuilder);
    }
}
