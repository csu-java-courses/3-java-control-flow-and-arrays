package com.example.task07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task07MainTest {

    @Test
    public void testSum() {
        Assertions.assertEquals(0, Task07Main.sum(new int[]{0, 0, 0, 0}), "сумма массива из 4 нулей = 0");
        Assertions.assertEquals(10, Task07Main.sum(new int[]{1, 2, 3, 4}), "сумма массива [1,2,3,4] = 10");
        Assertions.assertEquals(-1, Task07Main.sum(new int[]{1, 2, 3, -7}), "сумма массива [1,2,3,-7] = -1");
        Assertions.assertEquals(5, Task07Main.sum(new int[]{5}), "сумма массива из одного элемента равного 5 = 5");
        Assertions.assertEquals(0, Task07Main.sum(new int[]{}), "сумма пусстого массива = 0");
        Assertions.assertEquals(0, Task07Main.sum(new int[0]), "сумма пусстого массива = 0");
    }

}