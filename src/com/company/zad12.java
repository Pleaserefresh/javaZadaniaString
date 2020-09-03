package com.company;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c;
        System.out.println("Swapping numbers with third variable");
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a, b = " + a + ", " + b);
        c = a;
        a = b;
        b = c;

        System.out.println("After swapping: a, b = " + a + ", " + b);

        System.out.println("Swapping numbers without third variable");

        System.out.print("Input first number: ");
        int d = scanner.nextInt();
        System.out.print("Input second number: ");
        int e = scanner.nextInt();
        System.out.println("Before swapping: a, b = " + d + ", " + e);

        d = d + e;
        e = d - e;
        d = d - e;
        System.out.println("After swapping: a, b = " + d + ", " + e);

    }
}
