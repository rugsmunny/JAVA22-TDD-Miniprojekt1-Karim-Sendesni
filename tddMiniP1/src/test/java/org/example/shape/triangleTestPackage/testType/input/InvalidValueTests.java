package org.example.shape.triangleTestPackage.testType.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.shape.triangleTestPackage.TestTriangle.setTriangle;
import static org.example.shape.triangleTestPackage.TestTriangle.triangle;
import static org.example.shape.util.UserInputMockService.setUpMockUserInput;
import static org.example.shape.util.UserInputMockService.tearDownMockUserInput;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvalidValueTests {

    @Test
    @DisplayName("InvalidValueTest -> int parameters | a:1 , b:2 , c:3 | {expected : null}")
    void testNotATriangle() {
        assertNull(setTriangle(1, 2, 3).getCurrent_type());
    }

    @Test
    @DisplayName("InvalidValueTest -> int parameters | injected parameters > valid parameter amount | {expected : null}")
    void testValidUserInputInvalidLength() {
        setUpMockUserInput("3,4,5,6");
        setTriangle().getUserInput();
        tearDownMockUserInput();
        assertNull(triangle.getCurrent_type());
    }
}
