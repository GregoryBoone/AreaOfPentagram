package com.company;

import java.util.Scanner;
public class AreaOfPentagonProject {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Pentagon myObject = new Pentagon();

        System.out.println("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();

        System.out.println("The area of the pentagon is " + myObject.areaOfPentagon(r) );
    }
}
