package com.example;

/**
 * A simple calculator for basic arithmetic operations.
 * Supports addition, subtraction, multiplication, and division.
 */
public class Calculator {
    
    /**
     * Adds two numbers together.
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts the second number from the first.
     * @param x first number
     * @param y second number
     * @return difference
     */
    public int subtracttt(int a, int b) {  // DRIFT: params renamed from x,y to a,b
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
     * @param numerator the dividend
     * @param denominator the divisor
     * @return quotient
     * @throws ArithmeticException if denominator is zero
     */
    public double divide(int a, int b) {  // DRIFT: params renamed from numerator/denominator to a/b
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    /**
     * Calculates the power of a number.
     * See {@link Math#pow(double, double)} for reference.
     * @param base the base number
     * @param exponent the power to raise to
     * @return base raised to exponent
     */
    // DRIFT: This method was removed but javadoc remains!
    
    /**
     * Returns the absolute value of a number.
     * @param value the input number
     * @return absolute value
     */
    public int abs(int value) {
        return value < 0 ? -value : value;
    }
}
