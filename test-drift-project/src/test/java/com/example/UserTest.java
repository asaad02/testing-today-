package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void userHoldsNameAndAge() {
        User u = new User("bob", "bob@example.com");
        assertEquals("bob", u.getName());
        assertEquals(0, u.getAge());
    }
}
