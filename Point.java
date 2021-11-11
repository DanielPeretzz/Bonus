package com.homework.daniel;

public class Point {
    public  double Euclidean(double y2  , double y1 , double x2 , double x1 ){
        double ac = Math.abs(y2 - x2);
        double cb = Math.abs(y1 - x1);
        return Math.hypot(ac, cb);
    }
}
