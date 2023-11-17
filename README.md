#JAVA22-TDD-Miniprojekt1-Karim-Sendesni
  
  -  First mini project in the TDD course. The assignment was to create all necessary tests for the code provided by our educator.

  Question:
  - "What tests might be necessary/important to include, and what was the most challenging part of this project?"

  Answer:
  - "The most challenging part was not so much writing the tests, but rather determining which tests were essential. It's possible to test every minute detail, even create a single test that covers everything. However, striking the right balance without having super test classes or methods was the real challenge. Making that decision was the most difficult part."

#Test Overview 
  class ValidValueTests:
    testEquilateralTriangle(): Tests an equilateral triangle with values 2, 2, 2.
    testScaleneTriangle(): Tests a scalene triangle with values 3, 4, 5.
    testIsoscelesTriangle(): Tests an isosceles triangle with values 3, 3, 4.
    testValidUserInput(): Tests user input with values 3, 4, 5.
  class InvalidValueTests:
    testNotATriangle(): Tests with invalid values for a triangle (1, 2, 3).
    testValidUserInputInvalidLength(): Tests user input with too many values (3, 4, 5, 6).
  class NumberFormatExceptionTests:
    testInvalidUserInputNumberFormatException(): Tests user input with invalid data types (x, y, z).
  class ConstructorTests:
    testStringConstructor(): Tests the constructor with a string array for a scalene triangle (3, 4, 5).
    testStringConstructorFaultyValueAmount(): Tests the constructor with an incorrect length of values (3, 4, 5, 0).
    testNegativeLengths(): Tests the constructor with negative values (-1, -2, -3).
    testInvalidStringConstructor(): Tests the constructor with invalid data types (a, b, c).
    testEmptyConstructor(): Tests the constructor with empty input.
