package org.example.shape.triangleTestPackage;


import org.example.shape.Triangle;
import org.junit.jupiter.api.AfterEach;

public class TestTriangle {

    public static Triangle triangle;

    public static Triangle setTriangle() { triangle = new Triangle(); return triangle; }

    public static Triangle setTriangle(int a, int b, int c) { triangle = new Triangle(a, b, c); return triangle; }

    public static Triangle setTriangle(String[] values) { triangle = new Triangle(values); return triangle; }

    @AfterEach
    void nullTriangle() { triangle = null; }

}