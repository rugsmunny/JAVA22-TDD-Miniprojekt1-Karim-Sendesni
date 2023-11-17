package org.example.shape.triangleTestPackage.testType.input;

import org.example.shape.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.shape.triangleTestPackage.TestTriangle.setTriangle;
import static org.example.shape.triangleTestPackage.TestTriangle.triangle;
import static org.example.shape.util.UserInputMockService.setUpMockUserInput;
import static org.example.shape.util.UserInputMockService.tearDownMockUserInput;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidValueTests {

    @Test
    @DisplayName("ValidValueTest -> int parameters | EQUILATERAL values by 'setTriangle(2,2,2)' | {expected : Triangle.TYPE.EQUILATERAL}")
    void testEquilateralTriangle() {
        assertEquals(Triangle.TYPE.EQUILATERAL, setTriangle(2, 2, 2).getCurrent_type());
    }

    @Test
    @DisplayName("ValidValueTest -> int parameters | SCALENE values by 'setTriangle(3, 4, 5)' | {expected : Triangle.TYPE.SCALENE}")
    void testScaleneTriangle() {
        assertEquals(Triangle.TYPE.SCALENE, setTriangle(3, 4, 5).getCurrent_type());
    }

    @Test
    @DisplayName("ValidValueTest -> int parameters | ISOSCELES values by 'setTriangle(3, 3, 4)' | {expected : Triangle.TYPE.ISOSCELES}")
    void testIsoscelesTriangle() {
        assertEquals(Triangle.TYPE.ISOSCELES, setTriangle(3, 3, 4).getCurrent_type());
    }

    @Test
    @DisplayName("ValidValueTest -> String parameters | SCALENE values by 'getUserInput()' | {expected : Triangle.TYPE.SCALENE}")
    void testValidUserInput() {
        setUpMockUserInput("3,4,5");
        setTriangle().getUserInput();
        tearDownMockUserInput();
        assertEquals(Triangle.TYPE.SCALENE, triangle.getCurrent_type());
    }

}
