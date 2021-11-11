package com.homework.daniel;

import java.util.Scanner;

public class Bonus {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Point Euclidean = new Point();
        System.out.println("enter 2 point");
        System.out.println("the first by separated : ");
        double y2 = SCANNER.nextDouble();
        double y1 = SCANNER.nextDouble();
        System.out.println("the second by separated : ");
        double x2 = SCANNER.nextDouble();
        double x1 = SCANNER.nextDouble();
        System.out.println(EuclideanPRO.Euclidean(y2,y1,x2,x1));
    }
}
