package com.example.task09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task09MainTest {

    @Test
    public void testMin() {
        Assertions.assertEquals(0, Task09Main.min(new int[]{0, 0, 0, 0}), "min [0, 0, 0, 0] = 0");
        Assertions.assertEquals(1, Task09Main.min(new int[]{1, 1, 1, 1}), "min [1, 1, 1, 1] = 1");
        Assertions.assertEquals(1, Task09Main.min(new int[]{1, 2, 3, 4}), "min [1, 2, 3, 4] = 1");
        Assertions.assertEquals(2, Task09Main.min(new int[]{5, 4, 3, 2}), "min [5, 4, 3, 2] = 2");
        Assertions.assertEquals(-7, Task09Main.min(new int[]{5, 4, -7, 2}), "min [5, 4, -7, 2] = -7");
        Assertions.assertEquals(2147483647, Task09Main.min(new int[]{2147483647}), "min [2147483647] = 2147483647");

    }

    /**
     * Обычно по сигнатуре или документации метода можно понять, будет ли этот метод производить модификацию аргументов.
     * Метод _поиска_ минимального значения не подразумевает его изменения.
     */
    @Test
    public void testModification() {
        int[] originalArray = {5, 4, 7, 2, 8, 3, 6};
        int[] argumentArray = originalArray.clone();
        Assertions.assertEquals(2, Task09Main.min(argumentArray), "min [5, 4, 7, 2, 8, 3, 6] = 2");
        Assertions.assertArrayEquals(originalArray, argumentArray, "Переданный в метод массив был изменен");

    }

}