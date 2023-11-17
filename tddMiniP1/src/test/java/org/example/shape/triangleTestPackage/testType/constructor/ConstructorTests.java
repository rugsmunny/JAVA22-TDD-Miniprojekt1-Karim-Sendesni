package org.example.shape.triangleTestPackage.testType.constructor;

import org.example.shape.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.shape.triangleTestPackage.TestTriangle.setTriangle;
import static org.junit.jupiter.api.Assertions.*;

public class ConstructorTests {

    @Test
    @DisplayName("Constructor test -> String[] parameter | valid SCALENE values | {expected: Triangle.TYPE.SCALENE}")
    void testStringConstructor() {

        assertEquals(Triangle.TYPE.SCALENE, setTriangle(new String[]{"3", "4", "5"}).getCurrent_type());

    }

    @Test
    @DisplayName("Constructor test -> String[] parameter | invalid .length | {expected: null}")
    void testStringConstructorFaultyValueAmount() {

        assertNull(setTriangle(new String[]{"3", "4", "5", "0"}).getCurrent_type());

    }

    @Test
    @DisplayName("Constructor test -> 3 int parameters | negative values | {expected: null}")
    void testNegativeLengths() {

        assertNull(setTriangle(-1, -2, -3).getCurrent_type());
    }

    @Test
    @DisplayName("Constructor test -> String[] parameter | invalid data type | {expected: null}")
    void testInvalidStringConstructor() {

        assertNull(setTriangle(new String[]{"a", "b", "c"}).getCurrent_type());
    }

    @Test
    @DisplayName("Constructor test -> empty constructor | {expected: notNull}")
    void testEmptyConstructor() {

        assertNotNull(setTriangle());
    }
}
