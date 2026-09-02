package com.example.task08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task08MainTest {

    @Test
    public void testMult() {
        Assertions.assertEquals(0L, Task08Main.mult(new int[]{0, 0, 0, 0}), "произведение массива из 4 нулей = 0");
        Assertions.assertEquals(1L, Task08Main.mult(new int[]{1, 1, 1, 1}), "произведение массива из 4 едениц = 1");
        Assertions.assertEquals(24L, Task08Main.mult(new int[]{1, 2, 3, 4}), "1 * 2 * 3 * 4 = 24");
        Assertions.assertEquals(-42L, Task08Main.mult(new int[]{1, 2, 3, -7}), "1 * 2 * 3 * -7 = -42");
        Assertions.assertEquals(5L, Task08Main.mult(new int[]{5}), "произведение массива из одного элемента равного 5 = 5");
        Assertions.assertEquals(0L, Task08Main.mult(new int[]{}), "произведение пустого массива = 0");
        Assertions.assertEquals(0L, Task08Main.mult(new int[0]), "произведение пустого массива = 0");
        Assertions.assertEquals(72000000000000L, Task08Main.mult(new int[]{8_000_000, 9_000_000}), "8_000_000 * 9_000_000 = 72000000000000");
    }

}