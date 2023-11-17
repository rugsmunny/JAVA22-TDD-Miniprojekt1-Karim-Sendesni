package org.example.shape.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class UserInputMockService {
    public static final InputStream originalSystemIn = System.in;
    public static void setUpMockUserInput(String mockInput) {
        System.setIn(new ByteArrayInputStream(mockInput.getBytes()));
    }
    public static void tearDownMockUserInput() {
        System.setIn(originalSystemIn);
    }
}
