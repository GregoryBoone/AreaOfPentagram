package com.company;

import java.util.Scanner;

public class Pentagon implements IPentagon{
    Scanner scanner = new Scanner(System.in);

    //int r = scanner.nextDouble();


    static double areaOfPentagon(double r){

        double s = 2 * r * Math.sin(Math.PI / 5);

        double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
        area = Math.round(area * 100) / 100.0;

        return area;
    }
}

