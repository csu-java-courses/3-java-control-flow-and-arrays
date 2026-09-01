package com.example.task10;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testNumMin() {
        Assert.assertEquals("numMin[0, 0, 0, 0] = 3", 3, Task10Main.numMin(new int[]{0, 0, 0, 0}));
        Assert.assertEquals("numMin[1, 1, 1, 1] = 3", 3, Task10Main.numMin(new int[]{1, 1, 1, 1}));
        Assert.assertEquals("numMin[1, 2, 3, 4] = 0", 0, Task10Main.numMin(new int[]{1, 2, 3, 4}));
        Assert.assertEquals("numMin[5, 4, 3, 2] = 3", 3, Task10Main.numMin(new int[]{5, 4, 3, 2}));
        Assert.assertEquals("numMin[5, 4, -7, 2] = 2", 2, Task10Main.numMin(new int[]{5, 4, -7, 2}));
        Assert.assertEquals("numMin[2147483647] = 0", 0, Task10Main.numMin(new int[]{2147483647}));
    }

    /**
     * Если минимумов несколько, то нужен номер последнего из них, а не первого.
     */
    @Test
    public void testNumMinReturnsLastOfEqualMinimums() {
        Assert.assertEquals("numMin[2, 5, 2, 9] = 2", 2, Task10Main.numMin(new int[]{2, 5, 2, 9}));
        Assert.assertEquals("numMin[-3, 7, -3, 8, -3] = 4", 4, Task10Main.numMin(new int[]{-3, 7, -3, 8, -3}));
        Assert.assertEquals("numMin[1, 1, 5] = 1", 1, Task10Main.numMin(new int[]{1, 1, 5}));
    }

    /**
     * Обычно по сигнатуре или документации метода можно понять, будет ли этот метод производить модификацию аргументов.
     * Метод _поиска_ номера минимального значения не подразумевает изменения массива, например сортировкой.
     */
    @Test
    public void testModification() {
        int[] originalArray = {5, 4, 7, 2, 8, 3, 6};
        int[] argumentArray = originalArray.clone();
        Assert.assertEquals("numMin[5, 4, 7, 2, 8, 3, 6] = 3", 3, Task10Main.numMin(argumentArray));
        Assert.assertArrayEquals("Переданный в метод массив был изменен", originalArray, argumentArray);
    }

}
