package com.company;

import java.util.Scanner;

public interface IPentagon {
    Scanner scanner = new Scanner(System.in);

    //double r = scanner.nextDouble();
    //double s = (2 * r) * Math.sin(Math.PI / 5);

    static double areaOfPentagon(double r){
        r = scanner.nextDouble();
        double s = (2 * r) * Math.sin(Math.PI / 5);

        double area = 5 * (s * s) / 4 * Math.tan(Math.PI / 5);

        return area;
    }
}
