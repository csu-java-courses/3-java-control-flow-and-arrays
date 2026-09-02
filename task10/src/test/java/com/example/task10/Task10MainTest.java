package com.example.task10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task10MainTest {

    @Test
    public void testNumMin() {
        Assertions.assertEquals(3, Task10Main.numMin(new int[]{0, 0, 0, 0}), "numMin[0, 0, 0, 0] = 3");
        Assertions.assertEquals(3, Task10Main.numMin(new int[]{1, 1, 1, 1}), "numMin[1, 1, 1, 1] = 3");
        Assertions.assertEquals(0, Task10Main.numMin(new int[]{1, 2, 3, 4}), "numMin[1, 2, 3, 4] = 0");
        Assertions.assertEquals(3, Task10Main.numMin(new int[]{5, 4, 3, 2}), "numMin[5, 4, 3, 2] = 3");
        Assertions.assertEquals(2, Task10Main.numMin(new int[]{5, 4, -7, 2}), "numMin[5, 4, -7, 2] = 2");
        Assertions.assertEquals(0, Task10Main.numMin(new int[]{2147483647}), "numMin[2147483647] = 0");
    }

    /**
     * Если минимумов несколько, то нужен номер последнего из них, а не первого.
     */
    @Test
    public void testNumMinReturnsLastOfEqualMinimums() {
        Assertions.assertEquals(2, Task10Main.numMin(new int[]{2, 5, 2, 9}), "numMin[2, 5, 2, 9] = 2");
        Assertions.assertEquals(4, Task10Main.numMin(new int[]{-3, 7, -3, 8, -3}), "numMin[-3, 7, -3, 8, -3] = 4");
        Assertions.assertEquals(1, Task10Main.numMin(new int[]{1, 1, 5}), "numMin[1, 1, 5] = 1");
    }

    /**
     * Обычно по сигнатуре или документации метода можно понять, будет ли этот метод производить модификацию аргументов.
     * Метод _поиска_ номера минимального значения не подразумевает изменения массива, например сортировкой.
     */
    @Test
    public void testModification() {
        int[] originalArray = {5, 4, 7, 2, 8, 3, 6};
        int[] argumentArray = originalArray.clone();
        Assertions.assertEquals(3, Task10Main.numMin(argumentArray), "numMin[5, 4, 7, 2, 8, 3, 6] = 3");
        Assertions.assertArrayEquals(originalArray, argumentArray, "Переданный в метод массив был изменен");
    }

}
