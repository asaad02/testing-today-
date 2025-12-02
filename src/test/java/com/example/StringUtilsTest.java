package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void joinConcatsWithSpace() {
        assertEquals("Hello World", StringUtils.join("Hello", "World"));
    }

    @Test
    void isBlankDetectsBlank() {
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("a"));
    }
}
