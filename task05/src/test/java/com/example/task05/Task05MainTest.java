package com.example.task05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task05MainTest {

    @Test
    public void testGetMin() {
        Assertions.assertEquals(0, Task05Main.getMin(0, 0, 0));
        Assertions.assertEquals(1, Task05Main.getMin(1, 2, 3));
        Assertions.assertEquals(3, Task05Main.getMin(5, 4, 3));
        Assertions.assertEquals(4, Task05Main.getMin(5, 4, 6));
        Assertions.assertEquals(Integer.MAX_VALUE, Task05Main.getMin(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        Assertions.assertEquals(Integer.MIN_VALUE, Task05Main.getMin(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

}