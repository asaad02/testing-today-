package com.example;

/**
 * A simple calculator for basic arithmetic operations.
 * Supports addition, subtraction, multiplication, and division.
 */
public class Calculator {
    

    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts the second number from the first.
     * @param a first number
     * @param b second number
     * @return difference
     */
    public int subtract(int a, int b) {  // DRIFT: params renamed from x,y to a,b
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     * Uses the multiply() helper method.
     * @param a multiplicand
     * @param b multiplier
     * @return product
     */
    public int times(int a, int b) {  // DRIFT: method renamed from multiply to times
        return a * b;
    }
    
    /**
     * Divides two integers.
     * @param a the dividend
     * @param b the divisor
     * @return quotient
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) {  // DRIFT: params renamed from numerator/denominator to a/b
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    // DRIFT: power() method removed; previously documented here.
    
    /**
     * Returns the absolute value of a number.
     * @param value the input number
     * @return absolute value
     */
    public int abs(int value) {
        return value < 0 ? -value : value;
    }
}
