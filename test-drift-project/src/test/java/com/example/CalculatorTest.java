package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addWorks() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void subtractWorks() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtract(3, 2));
    }
}
