package com.example.utils;

import com.example.geometry.Shape;

public class GeometryUtils {
    public static boolean areEqual(Shape s1, Shape s2) {
        return Double.compare(s1.getArea(), s2.getArea()) == 0 &&
               Double.compare(s1.getPerimeter(), s2.getPerimeter()) == 0;
    }

    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }
}