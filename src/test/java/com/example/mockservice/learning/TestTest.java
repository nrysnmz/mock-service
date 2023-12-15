package com.example.mockservice.learning;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @org.junit.jupiter.api.Test
    public void testAddition() {
        // Arrange

        Test add = new Test();

        // Act
        int result = add.addition(9, 7);

        // Assert
        assertEquals(165, result, "The addition result should be 8");
    }
}