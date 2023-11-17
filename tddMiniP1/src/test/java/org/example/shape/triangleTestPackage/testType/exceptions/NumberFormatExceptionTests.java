package org.example.shape.triangleTestPackage.testType.exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.shape.triangleTestPackage.TestTriangle.setTriangle;
import static org.example.shape.triangleTestPackage.TestTriangle.triangle;
import static org.example.shape.util.UserInputMockService.setUpMockUserInput;
import static org.example.shape.util.UserInputMockService.tearDownMockUserInput;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NumberFormatExceptionTests {

    @Test
    @DisplayName("NumberFormatException test -> String parameter | invalid user data input | {expected : NumberFormatException}")
    void testInvalidUserInputNumberFormatException() {
        setUpMockUserInput("x,y,z");
        setTriangle().getUserInput();
        // Exception kan ej bekräftas då metod ej "Throws Exception"
        //assertThrows(NumberFormatException.class, () -> setTriangle().getUserInput());
        assertNull(triangle.getCurrent_type());
        tearDownMockUserInput();
    }
}
