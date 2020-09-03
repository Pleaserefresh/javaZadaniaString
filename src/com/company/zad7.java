package com.company;


import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double volume;
        double diameter;

        System.out.print("Enter the diameter of a sphere: ");
        diameter = scanner.nextDouble();
        radius = diameter / 2;
        volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("The radius for the sphere is " + radius + "\nand the volume of the sphere is : " + volume);
    }

}

