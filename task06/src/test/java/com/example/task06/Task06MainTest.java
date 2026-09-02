package com.example.task06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task06MainTest {

    @Test
    public void testGetMax() {
        Assertions.assertEquals(0, Task06Main.getMax(0, 0, 0, 0));
        Assertions.assertEquals(4, Task06Main.getMax(1, 2, 3, 4));
        Assertions.assertEquals(5, Task06Main.getMax(5, 4, 3, 2));
        Assertions.assertEquals(9, Task06Main.getMax(5, 9, 3, 2));
        Assertions.assertEquals(7, Task06Main.getMax(5, 4, 7, 6));
        Assertions.assertEquals(Integer.MAX_VALUE, Task06Main.getMax(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        Assertions.assertEquals(Integer.MIN_VALUE, Task06Main.getMax(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

}